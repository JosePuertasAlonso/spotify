import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion')
export class VistaCancion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-cancion label {
    	font-size: 1rem;
    	line-height: 1.5rem;
    	text-transform: none;
    	letter-spacing: normal;
    	font-weight: 700;
    	

    }

      .boton-ajustes button {
    		border:none; 
    		background:none;
    		cursor: pointer; 
    		font-size: 15px; 
    		color: #A8A8A8;
    		align-self: center;
    		font-weight: 700;
    		line-height: 18px;
      }

      .boton-ajustes button:hover {
    		color: #FFFFFF;

      }

    	.boton-play button {
    		border:none; 
    		background:none; 
    		align-self: center; 
    		flex-end; 
    		flex-grow: 0; 
    		cursor: pointer;
    		background-color: #1ED760;
    		border-radius: 50%;
    	}

    	.boton-play svg:hover {
    		fill:white;
    	}

    	.boton-play img:hover {
    		max-width: 100%;
    		max-height: 100%;
    	}
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout class="boton-ajustes" style="align-items: center; background-color:#181818; border-radius: 0.7rem; padding: var(--lumo-space-m); width: 100%; height: 100%; max-height: 100%;" id="vL_fondo" theme="spacing">
 <button style="align-self: flex-end; margin-right: var(--lumo-space-s); margin: 0px;" id="button_opciones">· · ·</button>
 <vaadin-horizontal-layout id="hL_imagen" style="width: 100%; height: 100%; padding: 0px; margin: 0px;"></vaadin-horizontal-layout>
 <img style="border-radius: 0.7rem; max-height: 80%; max-width: 100%; display:none" src="" theme="" id="imagen">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; max-height: 20%; align-self: center; justify-content: space-between; align-items: center;" id="hL_tituloBotones">
  <vaadin-vertical-layout class="label-cancion" style="width: 100%; max-height: 100%; align-self: center; flex-shrink: 1; flex-grow: 0; margin: 0px;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">David Bisbal</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout class="boton-play" style="justify-content: flex-end;" id="hL_botones">
   <button style="align-self: flex-start; flex-grow: 0; flex-shrink: 0; width: 3rem; height: 3rem; padding: var(--lumo-space-s);" id="button_play">
    <svg role="img" height="" width="" viewbox="0 0 24 24" class="Svg-sc-1bi12j5-0 hDgDGI" style="width: 100%; height: 100%; max-width: 100%; max-height: 100%; min-width: 100%; min-height: 100%; text-align:center; display: flex; align-items: center;">
     <path d="M7.05 3.606l13.49 7.788a.7.7 0 010 1.212L7.05 20.394A.7.7 0 016 19.788V4.212a.7.7 0 011.05-.606z"></path>
    </svg></button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
