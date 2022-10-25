# OPERADORES EN JAVA:

Java proporciona muchos operadores según la necesidad. Funcionan para realizar cálculos matemáticos, comparar valores, unir idenitificadores y literales, para formar expresiones lógicas, toma de decisiones, etc.
* Aritmeticos
* Relacionales
* Lógicos
* Asignación

## Aritmético

SE usan para realizar operaciones simples.
Pero también se pueden usar en tipos de datos wrapper, o clase equivalente:
 * int -> Integer
 * boolean -> Boolean

Por lo que se pueden ejecutar operaciones con cualquiera de estos, convirtiendo por default en primitivo para usarlo.

### Operadores
* Multiplicacion: `7*2`
* Division: `6 / 2`
* Módulo o resto: `5%2 = 1` es el residuo de la division
* Suma: `7+2`
* Resta: `7-2`
* Incremento: `1++`
* Decremento: `2--`
* Menos unario: `-(4+2) = -6` SIrve para cambiar el signo

### Operadores combinados:
Ayudan a simplificar una expresión.
```java
int a = 3;
a +=5 //equivale a 8
```

## Incremeneto y Decremento
Usado para incrementar o decrementar el valor en 1.
* Pre-Incremento: Incrementa en uno y luego devuelve el valor:
`++a`
```java
int a = 1;
//en este caso, A valdrá 2 y b tambien valdrá 2
int b = ++a;
```

* Post-Incremento: DEvuelve el valor inicial y luego incrementa en 1:
  `a++`
```java
int a = 1;
//Ahora A vale 2 pero b solo vale 1
int b = a++;
```

Los ejemplos anteriores aplican para el decremento también.

## Operador ternario:
Es una version abreviada de la sentencia if-else.
TIene tres operadores:
```java
(condicion) ? valor1 : valor2;
//si la condicion se cumple, devuelve el valor1, si no, devuelve el valor2
int a = 2 > 3 ?1:2;
//como 2 no es mayor que 3, devuielve el numero 2.
```
## Operadores Relacionales:
Se utilizan para comprobar relaciones de igualdad, Mayor que, menor que,m y retorna un boleano,
true o false. 
```java
>  //mayor que
<  //menor que
>= //mayor o igual que
<= // menor o igual que
== // true si es igual que
!= // true si es distinto que
``` 

## Operadores Lógicos
PErmiten evaluar expresiones lógicas y trabajan con operadores boleanos.
```java
&& // and uno y otro
|| // or o es uno o es el otro
! // not  ninguno
``` 



