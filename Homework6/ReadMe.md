## SOLID
### 1. Принцип единственной ответственности.
Постарался реализовать сущности, которые имеют только одну ответственность.
### 2. Принцип открытости/закрытости.
Класс BaseCalculator расширил классом AdvancedCalculator. Закрытость классов достигается путем инкапсуляции, как в классе Values, или имплементации интерфейса к классу и использования интерфейса в коде. Так же реализовал закрытость, через класс контроллер.
### 3. Принцип подстановки Барбары Лисков.
При замене "бызового калькулятора" в коде и замене его на "расширенный калькулятор" программа будет работать. Достигается за счет наследования.
### 4. Приници разделения интерфейсов.
Разделил операции на два интерфейса с различными операциями для использования в разных калькуляторах - "базовом" и "расширенном".
### 5. Принцип инверсии зависимостей.
Завязал классы калькуляторов не на конкретную реализацию, а на интерфейсы. Необходимо связывать классы, через абстрактные интерфейсы.
