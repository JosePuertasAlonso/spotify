import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera';
import './vista-reproductor_resumido';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_canciones';
import './vista-albumes_del_artista';
import './vista-artistas_similares';
import './vista-listas_de_reproduccion_del_artista';

@customElement('vista-ver_perfil_artista')
export class VistaVer_perfil_artista extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing-xl" class="fuentes boton-rectangulo" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll; width: 100%; height: 100%;" id="vL_cuerpo">
  <vaadin-horizontal-layout theme="spacing-l" style="max-height: 43%; width: 100%;" id="hL_datosArtista">
   <img style="max-width: 100%; max-height: 100%; border-radius:50%; border: 2px solid #FFFFFF;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png" id="imagen">
   <vaadin-vertical-layout style="width: 100%; justify-content: space-between;" id="vL_nombreEstilosBotones">
    <vaadin-vertical-layout id="vL_nombreEstilos">
     <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1;" id="label_nombre">Nombre artista</label>
     <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; margin-bottom: var(--lumo-space-m);" id="hL_estilos">
      <label style="flex-shrink: 0; align-self: flex-start;" id="label_estilos">Estilos:</label>
      <label style="color:#A8A8A8; font-weight:400; align-self: flex-end;" id="label_estilos1">estilo1, estilo2</label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="hL_botones">
     <button style="align-self: center; width: 100%; max-width: 12%;" id="button_seguir">SEGUIR</button>
     <button style="align-self: center; width: 100%; max-width: 12%;" id="button_siguiendo">SIGUIENDO</button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vista-lista_canciones id="vistaLista_canciones"></vista-lista_canciones>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_albumes">Álbumes</label>
  <vista-albumes_del_artista style="margin-top: var(--lumo-space-m);" id="vistaAlbumes_del_artista"></vista-albumes_del_artista>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_artistasSimilares">Artistas similares</label>
  <vista-artistas_similares style="margin-top: var(--lumo-space-m);" id="vistaArtistas_similares"></vista-artistas_similares>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_listasDelArtista">Listas de reproducción de "artista"</label>
  <vista-listas_de_reproduccion_del_artista id="vistaListas_de_reproduccion_del_artista"></vista-listas_de_reproduccion_del_artista>
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
