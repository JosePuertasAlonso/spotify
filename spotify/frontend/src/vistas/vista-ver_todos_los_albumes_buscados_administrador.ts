import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';
import './vista-barra_buscador';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_albumes_ver_todo_administrador';

@customElement('vista-ver_todos_los_albumes_buscados_administrador')
export class VistaVer_todos_los_albumes_buscados_administrador extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="max-height: 90%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); width: 100%; height: 100%;overflow-y:scroll" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1;" id="label_buscaModifica">Busca y modifica elementos</label>
  <vista-barra_buscador style="max-height: 6%; max-width: 50%; width: 100%; height: 100%; align-self: center;" id="vistaBarra_buscador"></vista-barra_buscador>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0; margin-top: var(--lumo-space-xl);" id="label_todosAlbumesPara">Todos los álbumes para "busqueda"</label>
  <vaadin-horizontal-layout style="width: 100%; max-height: 9%; height: 100%;" id="hL_listaDeAlbumesVerTodoAdmin">
   <vista-lista_de_albumes_ver_todo_administrador style="width: 100%;" id="vistaLista_de_albumes_ver_todo_administrador"></vista-lista_de_albumes_ver_todo_administrador>
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
