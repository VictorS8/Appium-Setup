# Appium Setup

Teste de dispositivos móveis - iOS, Android

[Appium](https://appium.io/) usa o protocolo WebDriver do Selenium 

## Compatibilidade

* Para testar iOS - Mac OS (Precisa do [XCode CLI](https://developer.apple.com/download/all/?q=Command%20Line%20Tools%20for%20Xcode) - Basta atualizar o xcode)
* Para testar Android - Mac OS, Windows ou Linux (Precisa do [SDK](https://developer.android.com/studio/releases/platform-tools) >= 16)
* Tutorial em vídeo sobre setup no Appium no [Youtube](https://www.youtube.com/watch?v=GeFBUMVCens&list=PLIuQPt4XLm7CVoAGEwDLe_7Oc6LSyF1C9) - Nos episódios 2, 3 e 4 são setups de devices no Windows e Mac Os

### Em relação à Linguagens

- [Ruby](http://rubygems.org/gems/appium_lib)
- [Python](https://pypi.python.org/pypi/Appium-Python-Client)
- [Java](https://search.maven.org/#search|gav|1|g%3A"io.appium" AND a%3A"java-client")
- [JavaScript](https://www.npmjs.org/package/wd)
- [PHP](https://github.com/appium/php-client)
- [C#](https://www.nuget.org/packages/Appium.WebDriver/)
- [RobotFramework](https://github.com/jollychang/robotframework-appiumlibrary)

### Em relação ao Appium

* [Appium desktop](https://github.com/appium/appium-desktop) seria o servidor do appium com interface gráfica
* [Appium](https://appium.io/) seria o servidor do appium via CLI
* [Appium Inspector](https://github.com/appium/appium-inspector) funciona para identificar os accessibilities IDs, IDs e Xpaths (Vale lembrar que accessibilities IDs e IDs, são os que são recomendados para rodar os testes)

### Em relação à Projeto

* [Exemplos de projeto do Appium](https://github.com/appium/appium/tree/1.x/sample-code)
* Existe agora o próprio projeto aqui, com um exemplo simples na minha aplicação
