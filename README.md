# Animal Project - Estudo de Herança em Java

## Objetivo

Projeto criado para praticar os principais conceitos de Programação Orientada a Objetos (POO) em Java:

- Herança 
- Sobrescrita de métodos 
- Sobrecarga de métodos (Overload)
- Classes abstratas 
- Enum para valores fixos

A ideia é modelar animais usando uma classe pai (`Animal`) e classes filhas como `Dog` e `Cat`.

---

## Objetivo

**O que entendi:** Aprendi herança, `super()`, sobrescrita (`@Override`), sobrecarga, `enum` e encapsulamento, entendendo como reutilizar código e organizar melhor as classes.

**Decisões tomadas:** Usei herança para evitar repetição, `enum` para limitar valores fixos e sobrescrita/sobrecarga para deixar comportamentos mais específicos.

**Como testei:** Testei tudo na `Main`, criando objetos e chamando métodos para verificar se os comportamentos estavam funcionando corretamente.

## Estrutura do Projeto

```text
app/
  Main.java

enums/
  FurColor.java
  Habitat.java
  TrainingLevel.java

model/
  Animal.java
  Cat.java
  Dog.java

util/
  Validations.java

```
