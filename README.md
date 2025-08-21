# Guia de Layouts no Android Studio

Este repositório apresenta **exemplos de diferentes layouts do Android**, mostrando como posicionar e organizar elementos na interface de forma prática e intuitiva. Cada layout é demonstrado com uma Activity específica.

---

## 1. FrameLayout

**O que é:**  
O `FrameLayout` é um layout simples que serve principalmente para **exibir um único elemento ou empilhar elementos sobrepostos**. A posição padrão é no canto superior esquerdo, mas você pode usar `android:layout_gravity` para centralizar.

**Uso recomendado:**  
- Telas simples com **um elemento principal**.  
- Quando quiser **sobrepor views**, como colocar texto sobre imagem ou vídeo.

**Exemplo:**  
- Activity: `FrameLayoutActivity`  
- Elemento: `TextView` centralizado com a mensagem *“Exemplo de FrameLayout”*.

---

## 2. LinearLayout

**O que é:**  
O `LinearLayout` organiza os elementos em **linha (horizontal) ou coluna (vertical)**, seguindo a sequência em que são adicionados. Pode-se controlar margens e espaçamentos facilmente.

**Uso recomendado:**  
- Listas curtas de **botões ou textos**.  
- Quando a **ordem visual dos elementos** é importante.

**Exemplo:**  
- Activity: `LinearLayoutActivity`  
- Elementos: cinco botões organizados verticalmente, um abaixo do outro.

---

## 3. RelativeLayout

**O que é:**  
O `RelativeLayout` permite posicionar elementos **em relação a outros elementos ou ao contêiner pai**. Ele facilita alinhamentos sem precisar criar layouts aninhados.

**Uso recomendado:**  
- Quando é necessário **alinhamento flexível** entre elementos.  
- Ideal para telas onde os componentes precisam se **adaptar a diferentes resoluções**.

**Exemplo:**  
- Activity: `RelativeLayoutActivity`  
- Elemento: `TextView` centralizado com `android:layout_centerInParent="true"`.

---

## 4. ConstraintLayout

**O que é:**  
O `ConstraintLayout` é um layout poderoso que permite **criar interfaces complexas** usando restrições relativas entre elementos e com relação ao container. Ele reduz a necessidade de múltiplos layouts aninhados, melhorando a performance.

**Uso recomendado:**  
- Layouts responsivos que precisam se **adaptar a diferentes telas**.  
- Quando se deseja **manter a hierarquia de views enxuta**.

**Exemplo:**  
- Activity: `ConstraintLayoutActivity`  
- Elemento: `TextView` centralizado com o texto *“Exemplo de ConstraintLayout”*.

---

## 5. RecyclerView

**O que é:**  
O `RecyclerView` é usado para criar **listas ou grades de itens de forma eficiente**, reutilizando as views que saem da tela. Ele trabalha junto com um **Adapter**, que fornece os dados e gerencia a criação dos elementos.

**Uso recomendado:**  
- Listas longas ou **dinâmicas de dados**.  
- Para exibir **cards, imagens ou qualquer componente repetitivo**.  
- Quando é necessária **alta performance e scroll fluido**.

**Exemplo:**  
- Activity: `RecyclerActivity`  
- Elementos: lista de itens, pronta para exibir dados dinamicamente através do Adapter.

---

## Resumo das finalidades

| Layout           | Finalidade principal                  |
|-----------------|-------------------------------------|
| FrameLayout      | Sobreposição ou elemento único       |
| LinearLayout     | Empilhamento horizontal ou vertical |
| RelativeLayout   | Posicionamento relativo entre elementos |
| ConstraintLayout | Layouts complexos e responsivos     |
| RecyclerView     | Listas e grids eficientes           |

Este projeto permite entender **quando e por que usar cada tipo de layout**, fornecendo exemplos prontos que podem ser modificados ou expandidos.

---
