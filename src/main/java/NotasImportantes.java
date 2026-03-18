public class NotasImportantes {
    {
        //? Cual es la diferencia entre una interface y una clase abstracta?

        //* En si, con JAVA actual no hay mucha diferencia entre una y otra
        //* Una clase solo permite una herencia pero multiples interfaces
        //* Una clase abstracta puede tener constructor y una interface no
        //* Ambas pueden tener metodos abstractos y metros concretos

        //? La verdadera diferencia esta en su INTERPRETACION en codigo

        //* CLASE ABSTRACTA -> DEFINE QUE ES
        //* INTERFACE -> DEFINE QUE PUEDE HACER

        //?Ej:
        /**
         * Abstract class Animal; Definimos el template de nuestra clase ANIMAL
         *
         * interface Volador { void volar() }; Definios una funcionalidad o accion
         *
         * class Aguila extends Animal imlpements Volador {}
         * Aguila ES UN animal y  PUEDE volar
         *
         */

        //? Que es la composicion?
        //* COMPOSICION -> DEFINE "TIENE UN"


        //?--------------------------------------------------------------------------------------

        //* Q HACE CADA CAPA?
        //* - MODEL : ALMACENA LOS MODELOS, TEMPLATE DE LOS MODELOS BASES QUE MANEJAREMOS EN LA APP
        //* - INTERFACES : ALMACENA TODAS LAS INTERFACES O CLASES ABSTRACTAS DE NUESTRA APLICACION
        //* - REOPSITORY : ALMACENA LOS REPOSITORIOS : UN REPOSITORIO TIENE LA LOGICA DE CONECCION CON LA DB O EL ALMACENAMIENTO DE NUESTROS DATOS - SUELE SER LA CLASE CONCRETA DE LA INTERFACE
        //* - SERVICE : ALMACENA LOS SERVICIOS : UN SERVICIO TIENE LA LOGICA DEL NEGOCIO Y LA FUNCION DE VALIDAR DATOS ANTES DE LA PERSISTENCIA
        //? EN LA VISTA, VALIDACIONES DE LA VISTA, EN EL SERVICIO VALIDACIONES ENFOCADA MAS AL SISTEMA
        //* - EL CONTROLADOR ES EL INTERMEDIARIO Y ORQUESTADOR ENTRE LA VISTA Y EL SERVICIO

    }
}
