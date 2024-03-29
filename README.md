# Proyecto Académico
***
Sistema de gestión de turnos para una empresa que gestiona el personal a otras empresas de domiciliarios y mensajeros.

## Descripción del Proyecto
El sistema debe permitir la gestión de turnos y asignación del personal a las diferentes empresas que tienen contratado el servicio de domiciliarios y mensajeros.
***
## Tabla de Contenido
1. [Proyecto Académico](#proyecto-academico)
2. [Diagrama de Clases](#diagrama-de-clases)
3. [Patrones de diseño implementados](#patrones-de-diseo-implementados)
4. [Descripcion Patron Visitor](#descripcion-patron-visitor)
5. [Requerimientos Funcionales](#requerimientos-funcionales)
6. [Pruebas](#pruebas)
7. [Tecnologias](#tecnologias)
***
### Diagrama de Clases
Modelo de clases del proyecto.

![](diagramaClasesTurnos-1.png)

## Patrones de diseño implementados
1. Builder (Patron Creacional)
2. Bridge  (Patron Estructural)
3. Visitor (Patron de Comportamiento)
## Descripcion Patron Visitor
***
El patrón de diseño Visitor resuelve un problema específico relacionado con la necesidad de implementar métodos fuera de las clases que contienen los datos. Este problema surge cuando se requiere agregar funcionalidades a clases que están fuera de nuestra competencia o cuando las clases no tienden a cambiar o crearse nuevas clases de esa jerarquía.

En este proyecto, el patrón Visitor se adapta perfectamente al contexto y a los requisitos específicos. Tenemos la necesidad de calcular la nómina de los empleados, y actualmente contamos con empleados de cuatro tipos diferentes: domiciliario a tiempo completo, domiciliario a medio tiempo, mensajero a tiempo completo y mensajero a medio tiempo. Cada tipo de empleado se calcula de manera distinta, y el valor de la hora varía según las horas extras, las horas diurnas y nocturnas, y los recargos, siguiendo las regulaciones legales. Por lo tanto, es crucial separar la lógica que calcula el pago de los empleados en una clase diferente.

La implementación del patrón Visitor se refleja en el código de nuestro proyecto. Podemos observar la presencia de la interfaz Visitor, que se llama desde la clase "Personal" mediante el método "accept". Además, se implementa la clase "CalcularPagoVisitor", que contiene la lógica correspondiente al cálculo del pago para cada tipo de empleado.

La adopción de este patrón de diseño mejora la calidad del código y la mantenibilidad del sistema. Al implementar patrones de diseño adecuados y limpios, podemos realizar modificaciones recurrentes en el proceso de cálculo de pagos afectando únicamente a la clase "CalcularPagoVisitor", dejando estables las demás clases y herencias de los tipos de empleados.

En cuanto al rendimiento y la eficiencia del sistema, aunque se agrega una interfaz y una clase adicional para el manejo del patrón de diseño, la segmentación de la funcionalidad del código mejora la legibilidad y facilita futuros mantenimientos.

Si bien el patrón Visitor puede no ser ampliamente conocido por todos los desarrolladores, es fácil de entender y utilizar en contextos donde hay comportamientos variados. Por ejemplo, en un supermercado, los productos siempre son los mismos, pero las ofertas y promociones pueden ser muy diversas. En este caso, el patrón Visitor se enfoca en el comportamiento de las clases, lo cual resulta útil.

En cuanto a la integración con otros patrones y técnicas de diseño utilizados en el proyecto, el patrón Visitor se integra de manera efectiva y no presenta conflictos o incompatibilidades significativas.

Aunque existen alternativas y variaciones del patrón Visitor, en este proyecto en particular, es posible que no sean más adecuadas. Sin embargo, es importante tener en cuenta que una mala implementación del patrón puede generar problemas y complicaciones para los desarrolladores. En algunos casos, puede ser preferible optar por un patrón más sencillo, aunque esto implique desaprovechar parte del potencial que tiene el patrón Visitor.

En cuanto a la documentación del patrón de diseño y su uso en el proyecto, es recomendable contar con un diagrama de clases que represente la estructura del patrón Visitor y su relación con las demás clases. Además, se debe incluir una descripción detallada del proyecto, documentación del código y pruebas unitarias para garantizar la mantenibilidad del código en el futuro.

Es importante tener en cuenta que el patrón Visitor presenta algunas limitaciones y posibles problemas en el contexto del proyecto. Uno de los desafíos es la escalabilidad, especialmente al aumentar o modificar las clases que implementan el método "accept". Estas modificaciones requerirían alterar la clase que implementa la interfaz Visitor. Para abordar este problema, es necesario evaluar si el patrón utilizado es el más adecuado y, en caso de ser necesario, considerar la adición de métodos especializados en la clase correspondiente o la modificación de la misma para manejar los cambios necesarios.



## Requerimientos Funcionales
1. El sistema debe permitir ingresar la fecha del día que se desea programar el personal para ir a cumplir con el servicio.
2. Para la programación del turno, se debe solicitar el nombre de la empresa y la cantidad de personal requerido.
3. El sistema debe permitir asignar el personal disponible (Sin Asignación) al turno en programación.
4. El sistema debe permitir la creación de un nuevo empleado solicitando los datos de identificación, nombre, edad, tipo de contratación (mensajero o domiciliario), placa del vehículo, tipo de vehículo.
5. El sistema debe permitir asignar o desasignar el personal del turno en programación.

## Pruebas
1. Verificar que el sistema permita la creación de turnos para la programación del personal.
2. Verificar que el sistema permita la creación de nuevas empresas.
3. Verificar que el sistema permita la creación de nuevos empleados.
4. Verificar que el sistema permita la asignación de los empleados.
5. Verificar que el sistema reconozca si los empleados se encuentran sin asignación para el turno que se esté programando.


## Tecnologias
***
Lista de tecnologias utilizadas para el proyecto:
* [JAVA JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html): Version 17
* [DIA](http://dia-installer.de/index.html.es): Diagramador UML