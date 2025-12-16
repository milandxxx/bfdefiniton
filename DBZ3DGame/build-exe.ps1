# ===============================
# Build EXE DBZ3DGame
# ===============================

$projectPath = "C:\Users\Admin\Documents\GitHub\bfdefiniton\DBZ3DGame"
$jarPath = "$projectPath\DBZ3DGame.jar"
$exePath = "$projectPath\DBZ3DGame.exe"
$xmlConfigPath = "$projectPath\launch4j.xml"
$launch4jExe = "C:\Tools\launch4j\launch4j.exe"

# Crear archivo XML
$xmlContent = @"
<launch4jConfig>
    <dontWrapJar>false</dontWrapJar>
    <headerType>gui</headerType>
    <jar>$jarPath</jar>
    <outfile>$exePath</outfile>
    <errTitle>DBZ Game</errTitle>
    <cmdLine></cmdLine>
    <chdir>.</chdir>
    <priority>normal</priority>
    <downloadUrl>https://www.java.com/</downloadUrl>

    <manifest>
        <mainClass>com.dbz.game.Main</mainClass>
    </manifest>

    <jre>
        <minVersion>1.8.0</minVersion>
        <jdkPreference>preferJre</jdkPreference>
    </jre>
</launch4jConfig>
"@

Set-Content -Path $xmlConfigPath -Value $xmlContent -Encoding UTF8
Write-Host "XML generado en: $xmlConfigPath"

# Ejecutar Launch4j
Write-Host "Ejecutando Launch4j..."
& $launch4jExe $xmlConfigPath

if (Test-Path $exePath) {
    Write-Host "✅ EXE generado correctamente:"
    Write-Host $exePath
} else {
    Write-Host "❌ ERROR: Launch4j falló y NO generó el EXE."
    Write-Host "Revisa si el JAR tiene la clase principal: com.dbz.game.Main"
}
