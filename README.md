# Gilded Rose Magatzem

## Descripcion
Este proyecto es una refactorizacion de un codigo legacy de un almacen.
El codigo original funcionaba pero era muy dificil de leer porque tenia
muchisimos ifs anidados. Lo hemos reorganizado usando el patron Strategy.

## Como funciona
Cada tipo de articulo tiene su propia clase que sabe como actualizarse
cada dia. Asi el codigo principal queda limpio y facil de entender.

## Clases creadas

**ActualitzadorNormal**
Gestiona los articulos normales. Cada dia baja la calidad en 1.
Si caduca baja el doble de rapido.

**ActualitzadorFormatgeGidurat**
El queso mejora con el tiempo en lugar de empeorar.
Cada dia sube la calidad en 1.

**ActualitzadorMartell**
El martillo es legendario e inmutable.
Nunca cambia su calidad ni sus dias.

**ActualitzadorEntrades**
Las entradas suben de precio segun la urgencia.
Mas de 10 dias +1, menos de 10 dias +2, menos de 5 dias +3.
Despues del concierto valen 0.

## Tests
4 tests que verifican que la logica no ha cambiado tras la refactorizacion.
Todos pasan correctamente.