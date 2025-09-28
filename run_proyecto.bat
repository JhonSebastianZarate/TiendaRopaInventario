@echo off
title Inventario Tienda Ropa
chcp 65001 >nul

:menu
cls
echo ================================
echo     PROYECTO TIENDA ROPA
echo ================================
echo 1. Ejecutar Main
echo 2. Ejecutar Factory Method
echo 3. Ejecutar Prototype
echo 4. Ejecutar Singleton
echo 5. Ejecutar Builder
echo 6. Ejecutar Abstract Factory
echo 7. Ejecutar Demo Entrega 2
echo 0. Salir
echo ================================
set /p opcion=Elige una opcion: 

:: Limpiar y compilar SIEMPRE antes de ejecutar
echo === Limpiando y compilando (UTF-8) ===
rmdir /s /q bin 2>nul
mkdir bin
javac -encoding UTF-8 -d bin ^
    src/com/tiendaderopa/app/*.java ^
    src/com/tiendaderopa/factorymethod/*.java ^
    src/com/tiendaderopa/prototype/*.java ^
    src/com/tiendaderopa/singleton/*.java ^
    src/com/tiendaderopa/builder/*.java ^
    src/com/tiendaderopa/abstractfactory/*.java ^
    src/com/tiendaderopa/command/*.java ^
    src/com/tiendaderopa/composite/*.java ^
    src/com/tiendaderopa/core/*.java ^
    src/com/tiendaderopa/observer/*.java
if errorlevel 1 (
    echo [ERROR] Fallo la compilacion. Revisa los mensajes arriba.
    pause
    goto menu
)
echo === Compilacion terminada ===

if "%opcion%"=="1" (cls & echo === Main === & java -cp bin com.tiendaderopa.app.Main & pause & goto menu)
if "%opcion%"=="2" (cls & echo === Factory Method === & java -cp bin com.tiendaderopa.factorymethod.Client & pause & goto menu)
if "%opcion%"=="3" (cls & echo === Prototype === & java -cp bin com.tiendaderopa.prototype.ClientPrototype & pause & goto menu)
if "%opcion%"=="4" (cls & echo === Singleton === & java -cp bin com.tiendaderopa.singleton.ClientSingleton & pause & goto menu)
if "%opcion%"=="5" (cls & echo === Builder === & java -cp bin com.tiendaderopa.builder.ClientBuilder & pause & goto menu)
if "%opcion%"=="6" (cls & echo === Abstract Factory === & java -cp bin com.tiendaderopa.abstractfactory.ClientAbstractFactory & pause & goto menu)
if "%opcion%"=="7" (cls & echo === Demo Entrega 2 === & java -cp bin com.tiendaderopa.app.DemoEntrega2 & pause & goto menu)
if "%opcion%"=="0" exit

goto menu
