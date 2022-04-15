import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-barra_buscador')
export class VistaBarra_buscador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .buscar button {
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

    .buscar button:hover {
    	    border: 1px solid #FFFFFF;
    }

    .buscar input {
    	font-size: 0.875rem;
    	line-height: 1rem;
    	border: none;
    	background:none;
    	outline: none;
    }


      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content buscar" style="width: 100%; height: 100%; background-color:#121212" theme="spacing-l" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing-s" style="background-color: white; border-radius: 500px; width: 100%; height: 100%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); margin: 0px;" id="hL_iconoInput">
  <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="max-width: 7%; height: 100%; width: 100%;">
   <path d="M0 0h24v24H0V0z" fill="none"></path>
   <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path>
  </svg>
  <input type="text" placeholder="Canciones, artistas o listas de reproducción" style="width: 100%; color:#121212" id="input_buscar">
 </vaadin-horizontal-layout>
 <button style="padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);" id="button_buscar">BUSCAR</button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
