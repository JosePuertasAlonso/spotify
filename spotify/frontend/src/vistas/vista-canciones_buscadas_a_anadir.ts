import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion_a_anadir';

@customElement('vista-canciones_buscadas_a_anadir')
export class VistaCanciones_buscadas_a_anadir extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorCancionesAAnadir">
 <vista-cancion_a_anadir style="width: 100%;" id="vistaCancion_a_anadir"></vista-cancion_a_anadir>
 <vista-cancion_a_anadir style="width: 100%;" id="vistaCancion_a_anadir1"></vista-cancion_a_anadir>
 <vista-cancion_a_anadir style="width: 100%;" id="vistaCancion_a_anadir3"></vista-cancion_a_anadir>
 <vista-cancion_a_anadir style="width: 100%;" id="vistaCancion_a_anadir2"></vista-cancion_a_anadir>
 <vista-cancion_a_anadir style="width: 100%;" id="vistaCancion_a_anadir4"></vista-cancion_a_anadir>
 <vista-cancion_a_anadir style="width: 100%;" id="vistaCancion_a_anadir5"></vista-cancion_a_anadir>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
