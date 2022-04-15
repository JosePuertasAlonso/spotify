import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
 <vaadin-vertical-layout theme="spacing-xl" class="fuentes " style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll; width: 100%; height: 100%;" id="vL_cuerpo">
  <vaadin-horizontal-layout theme="spacing-l" style="max-height: 40%; width: 100%;" id="hL_datosArtista" class="boton-rectangulo">
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
  <vaadin-horizontal-layout theme="spacing" id="hL_hits"></vaadin-horizontal-layout>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_albumes">Álbumes</label>
  <vaadin-horizontal-layout theme="spacing" id="hL_albumes"></vaadin-horizontal-layout>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_artistasSimilares">Artistas similares</label>
  <vaadin-horizontal-layout theme="spacing" id="hL_artistasSimilares"></vaadin-horizontal-layout>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_listasDelArtista">Listas de reproducción de "artista"</label>
  <vaadin-horizontal-layout theme="spacing" id="hL_listasDelArtista"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
