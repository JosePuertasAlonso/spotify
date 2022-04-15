import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_administrador')
export class VistaCancion_administrador extends LitElement {
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
<vaadin-horizontal-layout style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; margin: 0px; max-width: 60%;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%; margin: 0px;" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" id="imagen">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_cancionArtista">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_cancion">En tus planes</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_artista">David Bisbal</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-s);" id="hL_botones" class="label-lista">
  <button style="background:none; border:none; height: 30px; cursor: pointer; padding: 0px; width: 30px; min-height: 30px; min-width: 30px; max-width: 30px; max-height: 30px;" id="button_eliminar">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="width: 100%; height: 100%;">
    <path d="M0 0h24v24H0z" fill="none"></path>
    <path d="M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"></path>
   </svg></button>
  <button style="background:none; border:none; height: 30px; cursor: pointer; padding: 0px; width: 30px; min-width: 30px; min-height: 30px; max-width: 30px; max-height: 30px;" id="button_anadir">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="width: 100%; height: 100%;">
    <path d="M0 0h24v24H0z" fill="none"></path>
    <path d="M3 17.25V21h3.75L17.81 9.94l-3.75-3.75L3 17.25zM20.71 7.04c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.39-.39-1.02-.39-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83z"></path>
   </svg></button>
  <input type="checkbox" id="input_checkbox" style="padding: 0px; height: 20px; width: 20px; min-width: 20px; min-height: 20px; max-height: 20px; max-width: 20px;">
  <label style="align-self: center; color:#9D9D9D; font-weight: 400; margin: var(--lumo-space-s);" id="label_exito">éxito</label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
