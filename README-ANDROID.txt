# Tienda - Proyecto preparado para Android con GluonFX

Esta es una copia independiente del proyecto original de NetBeans.

## Cambios de configuración
- Java 17 (necesario para la configuración Gluon/GraalVM seleccionada).
- JavaFX Controls y FXML 21.0.9.
- GluonFX Maven Plugin 1.0.29.
- Perfil Maven `android` con destino Android ARM64.
- Identificador Android: `com.mycompany.tienda`.
- Reflexión para los controladores FXML.
- Workflow manual de GitHub Actions en `.github/workflows/android.yml`.

Las clases Java originales, `module-info.java` y el diseño de los FXML se conservaron. En los FXML solo se ajustó la versión declarada del namespace JavaFX a 21.0.9.

## Importante
Este ZIP contiene la configuración preparada, no un APK compilado. Primero debe abrirse y probarse en NetBeans en Windows. No se ha afirmado que la compilación Android ya haya sido ejecutada.
