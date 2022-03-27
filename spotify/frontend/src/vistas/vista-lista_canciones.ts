import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion';

@customElement('vista-lista_canciones')
export class VistaLista_canciones extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

::-webkit-scrollbar {
	width: 8px;
}

::-webkit-scrollbar-thumb {
	background: #414141;
	background: #A8A8A8;
	border-radius: 5px;
}
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background-color:#121212; align-items: flex-start; max-height: 100%; width: 100%; height: auto;" theme="spacing" id="vL_fondo">
 <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%; max-height: 5%;" id="label_titulo">Titulo de la lista</label>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; max-height: 95%; " id="vL_filaCanciones">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; flex-shrink: 0; flex-direction: row; max-height: 50%; max-width: 100%;" id="hL_contenedorCanciones">
   <vista-cancion id="vistaCancion"></vista-cancion>
   <vista-cancion id="vistaCancion1"></vista-cancion>
   <vista-cancion id="vistaCancion2"></vista-cancion>
   <vista-cancion id="vistaCancion3"></vista-cancion>
   <vista-cancion id="vistaCancion4"></vista-cancion>
   <vista-cancion id="vistaCancion5"></vista-cancion>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
