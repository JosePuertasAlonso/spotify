import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion_de_lista_a_eliminar';

@customElement('vista-canciones_de_lista_a_eliminar')
export class VistaCanciones_de_lista_a_eliminar extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contendorCancionesEliminar">
 <vista-cancion_de_lista_a_eliminar style="width: 100%;" id="vistaCancion_de_lista_a_eliminar"></vista-cancion_de_lista_a_eliminar>
 <vista-cancion_de_lista_a_eliminar style="width: 100%;" id="vistaCancion_de_lista_a_eliminar1"></vista-cancion_de_lista_a_eliminar>
 <vista-cancion_de_lista_a_eliminar style="width: 100%;" id="vistaCancion_de_lista_a_eliminar2"></vista-cancion_de_lista_a_eliminar>
 <vista-cancion_de_lista_a_eliminar style="width: 100%;" id="vistaCancion_de_lista_a_eliminar3"></vista-cancion_de_lista_a_eliminar>
 <vista-cancion_de_lista_a_eliminar style="width: 100%;" id="vistaCancion_de_lista_a_eliminar4"></vista-cancion_de_lista_a_eliminar>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
