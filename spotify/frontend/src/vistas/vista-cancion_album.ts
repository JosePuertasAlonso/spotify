import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_album')
export class VistaCancion_album extends LitElement {
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

    svg:hover {
    	fill:white;
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
<vaadin-horizontal-layout class="content label-cancion" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;" id="hL_tituloArtista">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center; margin: 0px;" id="vL_tituloArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%; margin: 0px;" id="label_titulo">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%; margin: 0px;" id="label_artista">David Bisbal</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-m); padding: 0px;" id="hL_checkbox" class="label-lista">
  <input type="checkbox" id="input_checkbox" style="padding: 0px; height: 25px; width: 25px; min-width: 25px; min-height: 25px; max-height: 25px; max-width: 25px;">
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
