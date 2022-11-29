# Enterprise-Java-Development-4.04

### ¿Utilizó el mismo tipo de ruta para actualizar la información de los pacientes y para actualizar un departamento de empleados? ¿Por qué elegiste la estrategia que elegiste?

No elegí el mismo tipo de ruta. Para poder actualizar el departamento de un empleado escogí hacer un PATCH ya que solo hay que actualizar uno de los campos 
de cada uno de los empleados. En cambio, para actualizar toda la información de un mismo paciente escogí un PUT ya que remplazaría la información existente de un paciente
por otra nueva que le pasásemos. 


### ¿Cuáles son los pros y los contras de las estrategias que elegiste para crear estas rutas?

Si se escogé realizar un PATCH solo tenemos acceso a determinados campos del objeto y no a todos, con lo que si queremos actualizar todo un objeto con todos sus 
campos es mejor emplear un PUT.

### ¿Cuáles son las ventajas y desventajas de PUT y PATCH?

La estrategia PUT requiere enviar una representación completa del objeto que se está modificando, 
es decir, se debe implementar de forma idempotente y es adecuado para situaciones en las que una
aplicación debe asegurarse que el estado final del objeto será idéntica a la que envía, como desventaja tenemos que 
si se quiere cambiar solo un parámetro tenemos que volver a reescribirlo todo con el único parámetro cambiado. 

El PATCH no es idempotente, por lo que se usa cuando queremos realizar modificaciones parciales, o para enviar 
un conjunto de instrucciones en lugar del resultado final. Por lo tanto como ventaja es que si solo queremos 
cambiar uno de los campos del objeto solo tenemos que escribir la modificación y ya se nos actualiza el objeto con 
el campo modificado. Como desventaja podríamos poner la creación de clases DTO de cada uno de los objetos, especificando 
aquellos campos que queremos modificar (nos hace perder tiempo y recursos). 


