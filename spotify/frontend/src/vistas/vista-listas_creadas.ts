import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_a_anadir';

@customElement('vista-listas_creadas')
export class VistaListas_creadas extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorListaAAnadir">
 <vista-lista_a_anadir style="width: 100%;" id="vistaLista_a_anadir"></vista-lista_a_anadir>
 <vista-lista_a_anadir style="width: 100%;" id="vistaLista_a_anadir1"></vista-lista_a_anadir>
 <vista-lista_a_anadir style="width: 100%;" id="vistaLista_a_anadir2"></vista-lista_a_anadir>
 <vista-lista_a_anadir style="width: 100%;" id="vistaLista_a_anadir3"></vista-lista_a_anadir>
 <vista-lista_a_anadir style="width: 100%;" id="vistaLista_a_anadir4"></vista-lista_a_anadir>
 <vista-lista_a_anadir style="width: 100%;" id="vistaLista_a_anadir5"></vista-lista_a_anadir>
 <vista-lista_a_anadir style="width: 100%;"></vista-lista_a_anadir>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
