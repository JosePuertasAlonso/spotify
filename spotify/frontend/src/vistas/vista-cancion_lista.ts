import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_lista')
export class VistaCancion_lista extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-lista label {
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
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="max-width: 50%; width: 100%; height: 100%; align-items: center;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%;" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" id="imagen">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">David Bisbal</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <button style="background:none; border:none; height: 2.3rem; width: 2.3rem; border:none; background:none; align-self: center; flex-end; flex-grow: 0; cursor: pointer; background-color: #1ED760; border-radius: 50%; margin-right: var(--lumo-space-xl);" id="button_play">
  <svg role="img" height="" width="" viewbox="0 0 24 24" class="Svg-sc-1bi12j5-0 hDgDGI" style="width: 100%; height: 100%; max-width: 100%; max-height: 100%; min-width: 100%; min-height: 100%; text-align;center; display: flex; align-items: center;">
   <path d="M7.05 3.606l13.49 7.788a.7.7 0 010 1.212L7.05 20.394A.7.7 0 016 19.788V4.212a.7.7 0 011.05-.606z"></path>
  </svg></button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
