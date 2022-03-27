import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera';
import './vista-reproductor_resumido';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-barra_buscador';
import './vista-lista_de_artistas_ver_todo';

@customElement('vista-ver_todos_los_artistas_buscados')
export class VistaVer_todos_los_artistas_buscados extends LitElement {
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

    .fuentes label {
    	font-size: 1.3rem;
    	letter-spacing: -0.04em;
    	font-weight: 700; 
    	color:#FFFFFF;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); width: 100%; height: 100%;overflow-y:scroll" id="vL_cuerpo">
  <vista-barra_buscador style="max-width: 100%; max-height: 5%; width: 50%;" id="vistaBarra_buscador"></vista-barra_buscador>
  <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1;" id="label_todosArtistasPara">Todos los artistas para "busqueda"</label>
  <vista-lista_de_artistas_ver_todo id="vistaLista_de_artistas_ver_todo"></vista-lista_de_artistas_ver_todo>
 </vaadin-vertical-layout>
 <vista-reproductor_resumido style="width: 100%; height: 10%;" id="vistaReproductor_resumido"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
