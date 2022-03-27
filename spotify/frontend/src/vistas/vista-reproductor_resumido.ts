import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-reproductor_resumido')
export class VistaReproductor_resumido extends LitElement {
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
<vaadin-horizontal-layout class="content" style="background-color:#121212; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="max-width: 30%; width: 100%; height: 100%; align-items: center;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%;" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" id="imagen">
  <vaadin-vertical-layout class="label-cancion" style="align-self: center; width: 100%; height: 100%; align-items: center; flex-direction: column; justify-content: center;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="labetl_artista">David Bisbal</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="max-width: 70%; align-self: center; width: 100%; height: 100%;" id="hL_reproductor">
  <audio src="https://mus5.about-in.tk/skm/ee4ed82c-0f20-45e9-a9bb-6219c1dfab36.mp3" controls="controls" type="audio/mpeg" preload="preload" style="background:none; align-self: center; width: 100%;" id="audio_reproductor"></audio>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
