import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-reproducir_cancion')
export class VistaReproducir_cancion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

      .boton-superior button {
    		border:none; 
    		background:none;
    		cursor: pointer; 
    		color: #A8A8A8;
    		align-self: center;
    		line-height: 18px;
    		font-size: 0.875rem;
    		line-height: 1.5rem;
    		text-transform: none;
    		letter-spacing: normal;
    		font-weight: 700;
      }

      .boton-superior button:hover {
    		color: #FFFFFF;
      }


      .boton-creditos button {
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

      .boton-creditos button:hover {
    		border: 1px solid #FFFFFF; 

      }







    .label-cancion label {
    	font-size: 1rem;
    	line-height: 1.5rem;
    	text-transform: none;
    	letter-spacing: normal;
    	font-weight: 700;
    	text-align: center;

    }

audio {
    filter: invert(100%);
}

audio::-webkit-media-controls-current-time-display, video::-webkit-media-controls-current-time-display,
audio::-webkit-media-controls-time-remaining-display, video::-webkit-media-controls-time-remaining-display {
    line-height: 300px;    
    font-size: 18px;
    font-weight: 800;

}

audio::-webkit-media-controls-panel {
  background-color: #eeeeee;
}

audio::-webkit-media-controls-play-button, video::-webkit-media-controls-play-button {
    filter: invert(100%);
    -webkit-appearance: media-play-button;
    display: flex;
    flex: none;
    border: none;
    box-sizing: border-box;
    width: 40px;
    height: 40px;
    border-radius:100%;
    line-height: 30px;
    margin-left: 9px;
    margin-right: 9px;
    padding: 0;
    background-color: white;
    color: inherit;
}
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212; max-width: 100%; max-height: 100%;" theme="spacing-s" id="vL_fondo">
 <vaadin-horizontal-layout class="boton-superior" theme="spacing-s" style="width: 100%; max-height: 80%; max-width: 100%; align-self: center; align-items: center; justify-content: center; height: 100%;" id="hL_creditosImagenOpciones">
  <vaadin-horizontal-layout class="boton-creditos" theme="spacing" style="max-width: 15%; align-self: flex-start; margin-top: var(--lumo-space-m); width: 100%; justify-content: center; align-items: center;" id="hL_creditos">
   <button style="align-self: center;" id="button_creditos">CREDITOS</button>
  </vaadin-horizontal-layout>
  <img style="max-width: 100%; max-height: 100%; height: 100%;" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" id="imagen">
  <vaadin-horizontal-layout theme="spacing" id="hL_opciones" style="max-width: 15%; min-width: 15%; align-self: flex-start; margin-top: var(--lumo-space-m); align-items: center; justify-content: center;">
   <button id="button_opciones">· · ·</button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="label-cancion" theme="spacing-xs" style="width: 100%; align-self: center; align-items: center; max-height: 10%;" id="vL_tituloArtista">
  <label style="align-self: center; color:#FFFFFF; width: 100%; text-align:center" id="label_titulo">En tus planes</label>
  <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%; text-align:center" id="label_artista">David Bisbal</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="max-width: 100%; align-self: center; width: 100%; max-height: 10%;" id="hL_reproductor">
  <audio src="https://mus5.about-in.tk/skm/ee4ed82c-0f20-45e9-a9bb-6219c1dfab36.mp3" controls="controls" type="audio/mpeg" preload="preload" style="background:none; align-self: center; width: 100%;" id="audio_reproductor"></audio>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
