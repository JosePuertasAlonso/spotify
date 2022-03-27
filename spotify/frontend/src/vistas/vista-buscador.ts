import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera';
import './vista-reproductor_resumido';
import './vista-barra_buscador';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_artistas_buscados';
import './vista-listas_de_reproduccion_buscadas';
import './vista-lista_de_canciones_buscadas';

@customElement('vista-buscador')
export class VistaBuscador extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes boton-rectangulo" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); width: 100%; height: 100%;" id="vL_cuerpo">
  <vista-barra_buscador style="max-width: 100%; max-height: 5%; width: 50%;" id="vistaBarra_buscador"></vista-barra_buscador>
  <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1;" id="label_resultadosPara">Resultados para "busqueda"</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 75%;" id="hL_cancionesArtistasListas">
   <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%;" id="vL_canciones">
    <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_cancionesVertodo">
     <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_canciones">Canciones</label>
     <button id="button_verTodoCanciones">Ver todo</button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 12%; height: 100%;" id="hL_listaDeCancionesBuscadas">
     <vista-lista_de_canciones_buscadas style="width: 100%;" id="vistaLista_de_canciones_buscadas"></vista-lista_de_canciones_buscadas>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%;" id="vL_artistas">
    <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_artistasVertodo">
     <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_artistas">Artistas</label>
     <button id="button_verTodoArtistas">Ver todo</button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 12%; height: 100%;" id="hL_listaDeArtistasBuscados">
     <vista-lista_de_artistas_buscados style="width: 100%;" id="vistaLista_de_artistas_buscados"></vista-lista_de_artistas_buscados>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="overflow-y:scroll; width: 100%;" id="vL_listasDeReproduccion">
    <vaadin-horizontal-layout style="align-items: center; width: 100%; justify-content: space-between; padding-right: var(--lumo-space-m);" id="hL_listasVertodo">
     <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0;" id="label_listasDeReproduccion">Listas de reproducción</label>
     <button id="button_verTodoListas">Ver todo</button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 12%; height: 100%;" id="hL_listasDeReproduccionBuscadas">
     <vista-listas_de_reproduccion_buscadas style="width: 100%;" id="vistaListas_de_reproduccion_buscadas"></vista-listas_de_reproduccion_buscadas>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vista-reproductor_resumido style="width: 100%; height: 10%;"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
