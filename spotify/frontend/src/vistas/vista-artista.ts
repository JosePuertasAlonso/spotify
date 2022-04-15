import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-artista')
export class VistaArtista extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-artista label {
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
<vaadin-vertical-layout style="background-color:#181818; border-radius: 0.7rem; width: 100%; height: 100%; padding: var(--lumo-space-l); align-items: center;" class="label-lista" theme="spacing" id="vL_fondo">
 <button style="border-radius: 0.7rem; max-width: 100%; max-height: 90%; padding: 0px; border:none; background:none; cursor:pointer; border-radius:50%" id="button_imagen"><img style="border-radius: 0.7rem; max-width: 100%; max-height: 100%; border-radius:50%" src="https://i.scdn.co/image/51488d1b1de7f592bcea6c66291dd274b95a9fc4" id="imagen"></button>
 <vaadin-vertical-layout style="width: 100%;" id="vL_nombreArtista">
  <label style="align-self: flex-start; color:#FFFFFF;" id="label_nombre">Bizarrap</label>
  <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">Artista</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
