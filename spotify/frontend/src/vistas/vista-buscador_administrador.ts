import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscador_administrador')
export class VistaBuscador_administrador extends LitElement {
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

      .boton-rectangulo button {
    		border:none; 
    		background:none;
    		border: 1px solid #A8A8A8;
    		border-radius: 5px;
    		cursor: pointer; 
    		color: #FFFFFF;
    		align-self: center;
    		font-size: 0.875rem;
    		padding: 7px 15px;
      }

      .boton-rectangulo button:hover {
    		border: 1px solid #FFFFFF; 

      }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%; padding: var(--lumo-space-l); margin: 0px;" class="fuentes " id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="max-height: 100%; width: 100%; height: 100%; margin: 0px; padding-bottom: 0px;" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1;" id="label_buscaModificaElementos">Busca y modifica elementos</label>
  <vaadin-horizontal-layout theme="spacing" id="hL_barraBuscador" style="max-height: 6%; max-width: 50%; width: 100%; height: 100%; align-self: center;"></vaadin-horizontal-layout>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0; margin-top: var(--lumo-space-xl);" id="label_resultadosPara">Resultados para "busqueda"</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 65%; margin-left: 0px;" id="hL_cancionesAlbumesArtistasPerfiles">
   <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%; margin-left: 0px; max-width: 33%; max-height: 100%;" id="vL_canciones">
    <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_cancionesVertodo" class="boton-rectangulo">
     <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_canciones">Canciones</label>
     <button id="button_verTodoCanciones">Ver todo</button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 20%; height: 100%; margin-top: 0px;" id="hL_listaDeCancionesBuscadasAdmin"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%; max-width: 33%; max-height: 100%;" id="vL_albumes">
    <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_albumesVertodo" class="boton-rectangulo">
     <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_albumes">Álbumes</label>
     <button id="button_verTodoAlbumes">Ver todo</button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 20%; height: 100%; margin-top: 0px;" id="hL_listaDeAlbumesBuscadosAdmin"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing-l" id="vL_artistasPerfiles" style="width: 100%; max-width: 33%; max-height: 100%;">
    <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%; margin-top: 0px; max-height: 100%;" id="vL_artistas">
     <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_artistasVertodo" class="boton-rectangulo">
      <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_artistas">Artistas</label>
      <button id="button_verTodoArtistas">Ver todo</button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 42%; margin-top: 0px;" id="hL_listaDeArtistasBuscadosAdmin"></vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%; max-height: 100%;" id="vL_perfiles">
     <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_perfilesVertodo" class="boton-rectangulo">
      <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_perfiles">Perfiles</label>
      <button id="button_verTodoPerfiles">Ver todo</button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 42%; margin-top: 0px;" id="hL_listaDePerfilesBuscadosAdmin"></vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
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
