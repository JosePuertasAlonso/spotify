import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-anuncio')
export class VistaAnuncio extends LitElement {
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

    label {
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
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" theme="spacing" id="hL_fondo">
 <img style="max-height: 100%; max-width: 100%;" src="https://i.scdn.co/image/51488d1b1de7f592bcea6c66291dd274b95a9fc4
" id="imagen">
 <vaadin-vertical-layout style="align-self: center; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center; width: 25%;" id="vL_tituloArtista">
  <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">Título del anuncio</label>
  <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">artista</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="overflow-y:scroll; height: 100%; width: 100%; padding: var(--lumo-space-s); align-items: center; max-height: 100%;" id="hL_descripcion">
  <label style="align-self: center; color:#9D9D9D; font-weight: 400; width: 100%; height: 100%; text-align: justify;" id="label_descripcion">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.</label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
