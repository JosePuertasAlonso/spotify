import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_bloque';

@customElement('vista-lista_de_reproduccion_ver_todo')
export class VistaLista_de_reproduccion_ver_todo extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background-color:#121212; align-items: flex-start; max-height: 100%; width: 100%; height: 100%;" theme="spacing" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" id="hL_contenedorListaReproduccionBloque">
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque1"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque2"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque3"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque4"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque5"></vista-lista_de_reproduccion_bloque>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_contenedorListaReproduccionBloque1">
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque6"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque7"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque8"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque9"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque10"></vista-lista_de_reproduccion_bloque>
  <vista-lista_de_reproduccion_bloque id="vistaLista_de_reproduccion_bloque11"></vista-lista_de_reproduccion_bloque>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
