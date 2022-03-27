import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_a_anadir')
export class VistaCancion_a_anadir extends LitElement {
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

    input[type="checkbox"]{
    	appearance: none;
    	-webkit-appearance: none;
    	height: 25px;
    	width: 25px;
    	background-color:#181818;
    	border: 1px solid #FFFFFF;
    	cursor:pointer;
    }


    input[type="checkbox"]:hover{
    	background-color:#121212;
    }

    input[type="checkbox"]:checked{
    	background-color:#1ED760;
    }

      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="max-width: 50%; width: 100%; height: 100%; align-items: center;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%;" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" id="imagen">
  <vaadin-vertical-layout class="label-cancion" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">David Bisbal</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-s" style="align-self: center; width: 100%; height: 100%; align-items: center; max-width: 50%; justify-content: flex-end; margin-right: var(--lumo-space-l);" id="hL_inputAnadir">
  <input type="checkbox" style="margin: 0px; padding: 0px;" id="input_checkbox">
  <label style="align-self: center; color:#9D9D9D; font-weight: 400;" id="label_anadirCancion">añadir canción</label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
