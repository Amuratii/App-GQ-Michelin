### README.md

# Aplicación de Gestión de Tareas para Michelin

Este repositorio contiene fragmentos del código fuente de la aplicación de gestión de tareas desarrollada para Michelin, utilizando Microsoft PowerApps. La aplicación está diseñada para facilitar la creación, seguimiento y administración de tareas dentro del departamento, optimizando los flujos de trabajo y mejorando la eficiencia operativa.

## Índice

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Características Principales](#características-principales)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Código](#estructura-del-código)
- [Fragmentos de Código](#fragmentos-de-código)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)
- [Contacto](#contacto)

## Descripción del Proyecto

Este proyecto se desarrolló como parte de mi trabajo de fin de grado en Desarrollo de Aplicaciones Multiplataforma. La aplicación de gestión de tareas está diseñada para ayudar a los trabajadores de Michelin en la gestión de sus tareas diarias, proporcionando una interfaz intuitiva y funcionalidades avanzadas para la creación, seguimiento y administración de tareas.

## Características Principales

- **Interfaz de Usuario Intuitiva**: Pantallas fáciles de navegar para la gestión de tareas.
- **Integración con SharePoint y Azure**: Para almacenamiento y manejo de datos.
- **Automatización de Flujos de Trabajo**: Utilizando PowerAutomate.
- **Control de Acceso**: Gestión de permisos basada en roles.

## Requisitos

- **Microsoft PowerApps**: Para ejecutar y modificar la aplicación.
- **Cuenta de Microsoft Office 365**: Para acceder a los servicios de SharePoint y Azure.
- **Conexión a Internet**: Para utilizar las funcionalidades en línea.

## Instalación

### Requisitos Previos

1. **Microsoft PowerApps**: Asegúrate de tener acceso a PowerApps a través de tu cuenta de Office 365.
2. **SharePoint**: Configura una lista de SharePoint para almacenar los datos de la aplicación.
3. **PowerAutomate**: Crea los flujos necesarios para automatizar los procesos.

### Pasos de Instalación

1. **Clonar el Repositorio**
   ```bash
   git clone https://github.com/tuusuario/nombre-repositorio.git
   ```
2. **Importar la Aplicación en PowerApps**
   - Abre PowerApps y selecciona "Importar aplicación".
   - Carga los archivos del repositorio.

3. **Configurar Conectores**
   - Configura los conectores de SharePoint y Azure en la aplicación.
   - Verifica los flujos de PowerAutomate asociados.

## Uso

1. **Acceder a la Aplicación**
   - Inicia sesión en PowerApps con tu cuenta de Office 365.
   - Abre la aplicación importada.

2. **Navegar por las Pantallas**
   - **Pantalla de Inicio**: Acceso rápido a las principales funcionalidades.
   - **Pantalla de Calendario Mensual**: Visualiza y gestiona las tareas del mes.
   - **Pantalla de Formulario de Creación de Tareas**: Crea y edita tareas.
   - **Pantalla de Calendario Semanal**: Visualiza la ocupación semanal de los trabajadores.
   - **Pantalla de Rechazo**: Mensaje de acceso restringido para usuarios no autorizados.

## Estructura del Código

- **Screens (Pantallas)**: Diferentes pantallas que componen la interfaz de usuario.
- **Components (Componentes)**: Elementos reutilizables dentro de la aplicación.
- **Connectors (Conectores)**: Interfaces para interactuar con servicios externos.
- **Variables y Colecciones**: Gestión de datos temporales y persistentes.
- **Funciones y Lógica de Negocio**: Funciones personalizadas y validaciones.

## Fragmentos de Código

### Inicialización de Variables Globales

```plaintext
// Inicializar variables globales
Set(UserLoggedIn, User().Email);
Set(AppTitle, "Gestión de Tareas Michelin");
```

### Carga de Datos desde SharePoint

```plaintext
// Cargar datos desde una lista de SharePoint
ClearCollect(DataCollection, SharePointListName);
```

### Manejo de Eventos del Usuario

```plaintext
// Evento de clic en un botón
OnSelect(Button1,
    Notify("Botón clicado", NotificationType.Information);
    Navigate(Screen2, ScreenTransition.Fade);
);
```

### Validación de Formulario

```plaintext
// Validar campos del formulario antes de enviar
If(IsBlank(TextInput1.Text),
    Notify("El campo no puede estar vacío", NotificationType.Error),
    SubmitForm(Form1)
);
```

### Automatización con PowerAutomate

```plaintext
// Invocar un flujo de PowerAutomate
Set(Result, 'PowerAutomateFlow'.Run(Parameter1, Parameter2));
```

### Uso de Colecciones para Manipular Datos

```plaintext
// Crear y manipular una colección
ClearCollect(TempCollection, Filter(OriginalData, Condition));
```

### Funciones Personalizadas

```plaintext
// Función personalizada para calcular un valor
Set(CalculatedValue, 
    If(Condition,
        Value1 * Value2,
        Value1 / Value2
    )
);
```

## Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar en este proyecto, por favor sigue los siguientes pasos:

1. **Fork el Repositorio**
2. **Crea una Rama Feature**
   ```bash
   git checkout -b feature/nueva-feature
   ```
3. **Realiza tus Cambios**
4. **Envía un Pull Request**

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo LICENSE.

## Contacto

Para más información o consultas, puedes contactarme a través de:

- **Correo Electrónico**: tuemail@dominio.com
- **LinkedIn**: [Tu Nombre](https://www.linkedin.com/in/tuusuario)

---

Este archivo README proporciona una guía clara y estructurada sobre el contenido del repositorio, cómo instalar y utilizar la aplicación, y detalles sobre la estructura del código y fragmentos importantes.
