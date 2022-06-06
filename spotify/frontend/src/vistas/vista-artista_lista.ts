import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-artista_lista')
export class VistaArtista_lista extends LitElement {
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
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; max-width: 100%; max-height: 100%;" theme="spacing" id="hL_fondo">
 <button style="max-height: 100%; max-width: 100%; height: 100%; padding: 0px; border:none; background:none; cursor:pointer; margin: 0px;" id="button_imagen"><img style="max-height: 100%; max-width: 100%; margin: 0px;" id="imagen"></button>
 <vaadin-vertical-layout class="label-lista" style="align-self: center; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL-nombreArtista">
  <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_nombre">Bizarrap</label>
  <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">Artista</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
