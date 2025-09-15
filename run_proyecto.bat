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
echo 0. Salir
echo ================================
set /p opcion=Elige una opcion: 

:: Recompilar siempre antes de ejecutar
echo === Compilando proyecto ===
rmdir /s /q bin 2>nul
javac -d bin src/com/tiendaderopa/app/*.java src/com/tiendaderopa/factorymethod/*.java src/com/tiendaderopa/prototype/*.java src/com/tiendaderopa/singleton/*.java src/com/tiendaderopa/builder/*.java src/com/tiendaderopa/abstractfactory/*.java
echo === Compilacion terminada ===

if "%opcion%"=="1" (cls & echo === Main === & java -cp bin com.tiendaderopa.app.Main & timeout /t 2 >nul & goto menu)
if "%opcion%"=="2" (cls & echo === Factory Method === & java -cp bin com.tiendaderopa.factorymethod.Client & timeout /t 2 >nul & goto menu)
if "%opcion%"=="3" (cls & echo === Prototype === & java -cp bin com.tiendaderopa.prototype.ClientPrototype & timeout /t 2 >nul & goto menu)
if "%opcion%"=="4" (cls & echo === Singleton === & java -cp bin com.tiendaderopa.singleton.ClientSingleton & timeout /t 2 >nul & goto menu)
if "%opcion%"=="5" (cls & echo === Builder === & java -cp bin com.tiendaderopa.builder.ClientBuilder & timeout /t 2 >nul & goto menu)
if "%opcion%"=="6" (cls & echo === Abstract Factory === & java -cp bin com.tiendaderopa.abstractfactory.ClientAbstractFactory & timeout /t 2 >nul & goto menu)
if "%opcion%"=="0" exit

goto menu
