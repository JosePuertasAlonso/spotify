import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-estilo')
export class VistaEstilo extends LitElement {
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
<vaadin-horizontal-layout class="content fuentes" style="width: 100%; height: 100%; background-color:#121212; align-items: center; padding: 0px; margin: 0px;" id="hL_fondo">
 <input type="checkbox" id="input_checkbox">
 <label style="align-self: center; color:#9D9D9D; font-weight: 400; margin: var(--lumo-space-s); font-size:1rem" id="label_estilo">estilo</label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
