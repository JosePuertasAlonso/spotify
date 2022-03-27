import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_canciones';
import './vista-barra_buscador';
import './vista-cabecera';
import './vista-reproductor_resumido';

@customElement('vista-comun')
export class VistaComun extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" id="vL_fondo">
 <vista-cabecera style="max-height: 10%; width: 100%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; width: 100%; height: 100%; max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll;" id="vL_contendorListasCanciones">
  <vista-barra_buscador style="max-width: 100%; max-height: 5%; width: 50%;" id="vistaBarra_buscador"></vista-barra_buscador>
  <vista-lista_canciones id="vistaLista_canciones"></vista-lista_canciones>
  <vista-lista_canciones id="vistaLista_canciones1"></vista-lista_canciones>
  <vista-lista_canciones id="vistaLista_canciones2"></vista-lista_canciones>
 </vaadin-vertical-layout>
 <vista-reproductor_resumido style="max-height: 10%; width: 100%;" id="vistaReproductor_resumido"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
