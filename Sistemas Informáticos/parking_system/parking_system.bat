@echo off
chcp 65001 > nul
setlocal enabledelayedexpansion

rem Variables de archivos
set "trucks_file=camiones.txt"
set "cars_file=coches.txt"
set "bikes_file=motos.txt"

rem Mostrar el menú
:menu
cls
echo =======================================
echo         Sistema de Multas
echo =======================================
echo 1. Agregar nueva multa
echo 2. Pagar multa
echo 3. Mostrar multas pendientes
echo 4. Consultar todos los registros
echo 5. Mostrar multas pagadas
echo 6. Mostrar todos los usuarios
echo 7. Mostrar vehículos, matrícula y dueño
echo 8. Buscar vehículo por matrícula
echo 9. Salir
echo =======================================
set /p option=Elige una opción (1-9):

if "%option%"=="1" goto add_ticket
if "%option%"=="2" goto pay_ticket
if "%option%"=="3" goto show_pending
if "%option%"=="4" goto show_all
if "%option%"=="5" goto show_paid
if "%option%"=="6" goto show_users
if "%option%"=="7" goto show_vehicles
if "%option%"=="8" goto search_by_plate
if "%option%"=="9" goto exit

goto menu

rem Agregar nueva multa
:add_ticket
cls

:input_nombre
set /p nombre=Nombre:
if "%nombre%"=="" goto input_nombre

:input_primer_apellido
set /p primer_apellido=Primer Apellido:
if "%primer_apellido%"=="" goto input_primer_apellido

:input_dni
set /p dni=DNI:
if not "%dni:~9%"=="" goto input_dni

:input_antiguedad_carnet
set /p antiguedad_carnet=Antigüedad del carnet (solo números):
for /f "delims=0123456789" %%a in ("%antiguedad_carnet%") do goto input_antiguedad_carnet

:input_tipo_vehiculo
set /p tipo_vehiculo=Tipo de vehículo (Camion/Coche/Moto):
if /i not "%tipo_vehiculo%"=="Camion" if /i not "%tipo_vehiculo%"=="Coche" if /i not "%tipo_vehiculo%"=="Moto" goto input_tipo_vehiculo

:input_marca
set /p marca=Marca:
if "%marca%"=="" goto input_marca

rem Validar matrícula (4 dígitos + 3 letras mayúsculas)
:input_matricula
set /p matricula=Matrícula (4 dígitos y 3 letras):
rem Limpiar espacios en blanco de la matrícula
set matricula=%matricula: =%

rem Verificar si la matrícula está vacía
if "%matricula%"=="" (
    echo No se ha ingresado ninguna matrícula. Por favor, intente de nuevo.
    goto input_matricula
)

rem Verificar que la matrícula tenga el formato correcto (4 dígitos seguidos de 3 letras mayúsculas)
echo %matricula% | findstr /R "^[0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z]$" > nul
if errorlevel 1 (
    echo Matrícula no válida. Debe tener 4 dígitos seguidos de 3 letras mayúsculas.
    rem Resetear la matrícula para el próximo intento
    set matricula=
    goto input_matricula
)

:input_num_puertas
set /p num_puertas=Numero de puertas (para coches), enter para otros:
if "%tipo_vehiculo%"=="Coche" if "%num_puertas%"=="" goto input_num_puertas
if "%tipo_vehiculo%"=="Coche" for /f "delims=0123456789" %%a in ("%num_puertas%") do goto input_num_puertas

:input_tara
set /p tara=Tara (para camiones), enter para otros:
if "%tipo_vehiculo%"=="Camion" if "%tara%"=="" goto input_tara

:input_estado_multa
set /p estado_multa=Estado de la multa (Pendiente/Pagada):
if /i not "%estado_multa%"=="Pendiente" if /i not "%estado_multa%"=="Pagada" goto input_estado_multa

if /i "%tipo_vehiculo%"=="Camion" (
    (for %%A in (!trucks_file!) do (
        set "last_line=%%A"
    )) < !trucks_file!
    if "%last_line%"=="" (
        (echo %nombre%,%primer_apellido%,%dni%,%antiguedad_carnet%,%tipo_vehiculo%,%marca%,%matricula%,%num_puertas%,%tara%,%estado_multa%)>> %trucks_file%
    ) else (
        (echo.%nombre%,%primer_apellido%,%dni%,%antiguedad_carnet%,%tipo_vehiculo%,%marca%,%matricula%,%num_puertas%,%tara%,%estado_multa%)>> %trucks_file%
    )
) else if /i "%tipo_vehiculo%"=="Coche" (
    (for %%A in (!cars_file!) do (
        set "last_line=%%A"
    )) < !cars_file!
    if "%last_line%"=="" (
        (echo %nombre%,%primer_apellido%,%dni%,%antiguedad_carnet%,%tipo_vehiculo%,%marca%,%matricula%,%num_puertas%,%tara%,%estado_multa%)>> %cars_file%
    ) else (
        (echo.%nombre%,%primer_apellido%,%dni%,%antiguedad_carnet%,%tipo_vehiculo%,%marca%,%matricula%,%num_puertas%,%tara%,%estado_multa%)>> %cars_file%
    )
) else if /i "%tipo_vehiculo%"=="Moto" (
    (for %%A in (!bikes_file!) do (
        set "last_line=%%A"
    )) < !bikes_file!
    if "%last_line%"=="" (
        (echo %nombre%,%primer_apellido%,%dni%,%antiguedad_carnet%,%tipo_vehiculo%,%marca%,%matricula%,%num_puertas%,%tara%,%estado_multa%)>> %bikes_file%
    ) else (
        (echo.%nombre%,%primer_apellido%,%dni%,%antiguedad_carnet%,%tipo_vehiculo%,%marca%,%matricula%,%num_puertas%,%tara%,%estado_multa%)>> %bikes_file%
    )
)

echo Multa agregada con éxito.
pause
goto menu

rem Pagar multa
:pay_ticket
cls
set /p dni=DNI de la persona para pagar la multa:
set /p tipo_vehiculo=Tipo de vehículo (Camion/Coche/Moto):

set "file="
if /i "%tipo_vehiculo%"=="Camion" set "file=%trucks_file%"
if /i "%tipo_vehiculo%"=="Coche" set "file=%cars_file%"
if /i "%tipo_vehiculo%"=="Moto" set "file=%bikes_file%"

if not defined file (
    echo Tipo de vehículo no válido.
    pause
    goto menu
)

set "temp_file=%file%.tmp"
(for /f "usebackq tokens=*" %%A in ("%file%") do (
    set "line=%%A"
    echo !line! | findstr /i "%dni%" >nul
    if errorlevel 1 (
        echo !line! >> "!temp_file!"
    ) else (
        set "new_line=!line:,Pendiente=,Pagada!"
        echo !new_line! >> "!temp_file!"
    )
)) < "%file%"

move /y "%temp_file%" "%file%"
echo Multa pagada con éxito.
pause
goto menu

rem Mostrar multas pendientes
:show_pending
cls
echo Multas Pendientes:
for %%F in (%trucks_file% %cars_file% %bikes_file%) do (
    echo == %%F ==
    findstr "Pendiente" %%F
)
pause
goto menu

rem Consultar todos los registros
:show_all
cls
echo Todos los registros:
type %trucks_file%
type %cars_file%
type %bikes_file%
pause
goto menu

rem Mostrar multas pagadas
:show_paid
cls
echo Multas Pagadas:
for %%F in (%trucks_file% %cars_file% %bikes_file%) do (
    echo == %%F ==
    findstr "Pagada" %%F
)
pause
goto menu

rem Mostrar todos los usuarios
:show_users
cls
echo Todos los usuarios:
for %%F in (%trucks_file% %cars_file% %bikes_file%) do (
    echo == %%F ==
    for /f "tokens=1,2,3 delims=," %%a in (%%F) do (
        if not "%%a"=="nombre" (
            echo Nombre: %%a %%b, DNI: %%c
        )
    )
)
pause
goto menu

rem Mostrar vehículos, matrícula y dueño
:show_vehicles
cls
echo Vehículos (Tipo, Marca, Matrícula):
for %%F in (%trucks_file% %cars_file% %bikes_file%) do (
    echo == %%F ==
    for /f "tokens=5,6,7 delims=," %%a in (%%F) do (
        echo Tipo: %%a, Marca: %%b, Matrícula: %%c
    )
)
pause
goto menu

rem Buscar vehículo por matrícula
:search_by_plate
cls
set /p matricula_buscar=Matrícula del vehículo:
echo Resultados de búsqueda para matrícula %matricula_buscar%:
for %%F in (%trucks_file% %cars_file% %bikes_file%) do (
    echo == %%F ==
    findstr /i "%matricula_buscar%" %%F
)
pause
goto menu

rem Salir
:exit
endlocal
exit
