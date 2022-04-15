import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-album_bloques')
export class VistaAlbum_bloques extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-album label {
    	font-size: 1rem;
    	line-height: 1.5rem;
    	text-transform: none;
    	letter-spacing: normal;
    	font-weight: 700;

    }

    svg:hover {
    	fill:white;
    }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background-color:#181818; border-radius: 0.7rem; width: 100%; height: 100%; padding: var(--lumo-space-l); align-items: center;" class="label-lista" theme="spacing-l" id="vL_fondo">
 <img style="border-radius: 0.7rem; max-width: 100%; max-height: 90%;" src="https://i.scdn.co/image/ab67616d00001e020ec1f3493edc0c888ff2d57c" id="imagen">
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; flex-shrink: 0;" id="hL_tituloPlay">
  <vaadin-vertical-layout style="width: 100%; margin: 0px;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF;" id="label_titulo">Shivers</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">Ed Sheeran</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="hL_botonPlay">
   <button style="align-self: flex-start; flex-grow: 0; flex-shrink: 0; width: 3rem; height: 3rem; border:none; align-self:center; cursor:pointer; background-color:#1ED760; border-radius:50%; padding: var(--lumo-space-s);" id="button_play">
    <svg role="img" height="" width="" viewbox="0 0 24 24" class="Svg-sc-1bi12j5-0 hDgDGI" style="text-align; center; display: flex; align-items: center;">
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
