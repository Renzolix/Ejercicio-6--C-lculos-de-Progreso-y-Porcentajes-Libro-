# Ejercicio 6: Libro

## Explicación Lógica
1. **Tope de Lectura:** El método `leer(int paginas)` incrementa `paginaActual`. Si la suma supera a `paginasTotales`, la lectura se ajusta automáticamente al límite máximo del libro.
2. **Conversión de Tipo (Casting):** En `mostrarProgreso()`, se realizó un *casting* explícito a `double` (`(double) paginaActual / paginasTotales`) para evitar la pérdida de decimales propia de la división entera en Java.
3. **Cálculo Derivado:** El porcentaje leído se calcula y muestra en tiempo real combinando los dos atributos numéricos.