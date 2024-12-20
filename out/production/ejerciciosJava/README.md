Un repositorio con varios códigos para practivar en Java, aquí estan los enunciados:

## Temperatura
Convierte de grados Celsius a
Farenheit y viceversa

## ConversorDivisas
Convierte libras en euros y
viceversa, mediante dos métodos llamados librasToEuros() y
eurosToLibras(), al igual como se puede cambiar el valor de cambio entre estos

## MiNumero
Calcula el doble, el triple y 
el cuádruple de un número y permita sumarlo y restarlo con otros números

## Distancia
una clase Distancia con dos métodos:
millasAMetros(): tomará como parámetro una distancia expresada en
millas y la transformará en kilómetros.
millasAKilometros(): hará lo mismo, pero convirtiendo las millas en
kilómetros.

## Restaurant

En un restaurante especializado en huevos fritos con chorizo necesitan un
programa que les calcule cuántos platos de huevos con chorizo pueden
preparar con la cantidad de existencias disponibles en la cámara frigorífica.
Escribe los siguientes métodos:
constructor(int, double): recibirá el número de docenas de huevos y de
kilos de chorizo disponible en el frigorífico.
-addHuevos(int): incrementa el número de docenas de huevos.
-addChorizos(double): incrementa el número de kilos de chorizo.
-getNumPlatos(): devuelvel el número de platos de huevos con chorizo
que se pueden ofrecer con las existencias actuales, teniendo en cuenta
que cada plato necesita una media de 2 huevos y 200 gramos de chorizo.
-sirvePlato(): disminuye el número de huevos y de kilos de chorizo
porque se ha servido un plato (2 huevos menos y 200 gramos de chorizo
menos)
-getHuevos(): devuelve el número de huevos (no de docenas) que quedan
en la cámara.
-getChorizo(): devuelve el número de kilos de chorizo que quedan en la
cámara.

## : Positive or negative
Leer un número por teclado mediante un método, y decir si es positivo o
negativo con otro método. La salida por consola puede ser algo así como: "el
número X es positivo"

## square root
Calcular la raíz cuadrada de un número introducido por teclado. Hay que
tener la precaución de comprobar que el número sea positivo.

## positive subtraction
Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la
resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3, el resultado
debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado debe ser B – A,
es decir, 3.

 Leap year
Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4;
utilícese el operador módulo. ¡Pero hay más excepciones! Los múltiplos de
100 no son bisiestos, aunque sean múltiplos de 4. Pero los múltiplos de 400
sí, aunque sean múltiplos de 100. Qué follón. La Tierra es muy maleducada
al no ajustarse a los patrones de tiempo humanos.
Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sea
divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es
divisible entre 400, también resulta bisiesto.

## Decimal part
Averiguar si un número real introducido por teclado tiene o no parte
fraccionaria

## Sorted numbers
Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de
menor a mayor. Complétalo con otro método que nos diga si los números,
además de estar ordenados, son consecutivos.

## num of digits
Determinar el número de cifras de un número entero. El algoritmo debe
funcionar para números de hasta 5 cifras, considerando los negativos. Por
ejemplo, si se introduce el número 5342, la respuesta del programa debe ser 4. Si se introduce –250, la respuesta debe ser 3.

## even or odds between nums
Escribe un programa que pregunte al usuario si desea ver los números pares o
impares y que, dependiendo de la respuesta, muestre en la pantalla los
números pares o impares entre A y B. Cualquiera de ellos puede ser el mayor.

## multiplication table
Vamos con un clásico de los cursos de introducción a la programación. El
usuario teclea un número y el programa muestra la tabla de multiplicar de ese
número.

##  Average 
Calcular el valor medio de una serie de valores enteros positivos introducidos
por teclado. Para terminar de introducir valores, el usuario debe teclear un
número negativo

## Class notes
El usuario de este programa será un profesor, que introducirá las notas de sus
30 alumnos de una en una. El algoritmo debe decirle cuántos suspensos y
cuántos aprobados hay. Las notas pueden valer entre 1 y 10, y el programa no
debe aceptar valores fuera de ese rango, se toma que se pasa con una nota mayor o igual a 5.

## Factorial
Calcular el factorial de un número entero N. Recuerda que el factorial de un
número es el producto de ese número por todos los enteros menores que él.

ATENCIÓN: No calcules números muy grandes, podrías dañar tu dispositivo

## FIBONACCI
escribe un programa que muestre en la pantalla los N
primeros términos de la sucesión de Fibonacci, siendo N un número entero
introducido por el usuario.

## Calculator 
Diseñar un algoritmo que lea dos números, A y B, y un operador (mediante
una variable de tipo carácter), y calcule el resultado de operar A y B con esa
operación. Por ejemplo, si A = 5 y B = 2, y operación = "+", el resultado debe
ser 7. El algoritmo debe seguir pidiendo números y operaciones
indefinidamente, hasta que el usuario decida terminar (utiliza un valor
centinela para ello)

## Math
Crea un paquete con dos clases llamadas Sumar
y Potenciar.
La clase Sumar tendrá un método suma(int, int), sobrecargado como
suma(double, double) para poder sumar números reales. La clase Potenciar
tendrá un método potencia(int, int) sobrecargado como potencia (double, int),
donde el primer parámetro será la base y el segundo el exponente.

## Geometric inheritance
![img.png](img.png)

1) Escribir la superclase Figura (figura geométrica), que contendrá:
   Dos atributos de instancia: color (String) y relleno (boolean).
   Dos constructores: uno sin argumentos que inicializará el color a "rojo"
   y relleno a true; y otro que recibirá dos argumentos para inicializar los
   atributos.
   Getters y setters.
   Sobreescritura del método toString() de Object para devolver la cadena:
   "Soy una figura de color xxx y rellena/no rellena".
2) Escribe una clase que compruebe que los métodos de Figura funcionan.
3) Escribe dos subclases de Figura llamadas Círculo y Rectángulo. La clase
   Circle contendrá:
   Una variable llamada radio (double).
   Tres constructores, como se ve en el diagrama de clases.
   El constructor
   sin argumentos establecerá el radio en 1.
   Getter y setter para el radio.
   Los métodos getArea() y getPerimetro(). Si no recuerdas como calcular
   el área y el perímetro (o circunferencia) de un círculo… bueno, tal vez
   necesites tomar algo para mejorar tu memoria. En cualquier caso, ¿para
   qué está la wikipedia?
   Sobreescribe el método toString() heredado de Figura. Ahora, el método
   devolverá: "Soy un círculo con radio = x, esta es mi superclase: yyy",
   donde yyy es la salida del método toString() de la superclase de Círculo.
4) La clase Rectángulo se comportará igual, con las lógicas diferencias en
   atributos y métodos getters y setters. Mira el diagrama de clases si tienes
   alguna duda.
5) Escribe una clase llamada Cuadrado como subclase de Rectángulo. Esta
   clase podía haberse modelado como subclase de Figura, pero es más cómodo
   hacerlo como subclase de Rectángulo porque podemos aprovechar casi todo
   el código de su superclase
   Además de crear el constructor, sobreescribe, como en los otros casos,
   el método toString().
   Atención, pregunta: ¿necesitarás sobreescribir getArea() y
   getPerimetro(), o funcionarán tal y como han sido heredados de
   Rectángulo? Haz la prueba a ver qué pasa...
   Sobreescribe los setters setAlto() and setAncho() para evitar que el largo
   y el ancho del cuadrado puedan tener dimensiones diferentes.

## Teacher
Crea una clase Profesor con los atributos nombre y sueldo y los getters y
setters correspondientes.
Crea luego una subclase Rector. Los directores cobran un 25% más aunque
realicen el mismo trabajo. Sobreescribe el método getSueldo() en Rector y
comprueba que funciona

##  Figures
Implementa una jerarquía de clases constituida por una clase Forma
(abstracta) de la que hereden Circulo, Cuadrado, Triangulo y Rombo.
La clase Forma tendrá un método abstracto toString() y otro identidad(), que
mostrará un identificador interno del objeto. Las demás clases heredarán de
Forma e implementarán el método abstracto toString()
