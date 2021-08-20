# Multimodule-simple-app

## Estructura

    multimodule
        |- module-1
        |   |-pom.xml
        |- module-2
        |   |-pom.xml
        |- module-3
        |   |-pom.xml
        |-pom.xml
    simple-app

## Dependencias

### Multimodule

    module-1 <- module-2, module-3
    module-2 <- X
    module-3 <- X

### simple-app
