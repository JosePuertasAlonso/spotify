import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';
import './vista-estilos';

@customElement('vista-modificar_artista')
export class VistaModificar_artista extends LitElement {
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

    .fuentes label {
    	font-size: 1.3rem;
    	letter-spacing: -0.04em;
    	font-weight: 700; 
    	color:#FFFFFF;
    	}

    .botonlabel label {
    	font-size:12px;
    }

    .botonlabel label:hover {
    	font-size:13px;
    }

    button {
    	font-size:12px;
    }

    button:hover {
    	font-size:13px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212; overflow-y:scroll;" class="fuentes" theme="spacing" id="vL_fondo">
 <vista-cabecera style="width: 100%; max-height: 10%;" id="vistaCabecera"></vista-cabecera>
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_modificarArtista">Modificar artista</label>
 <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 30%; width: 100%; align-items: center; align-self: center; margin-top: var(--lumo-space-xl);" id="vL_fotoBoton">
  <img style="max-width: 40%; border-radius:50%; border: 2px solid #FFFFFF;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png" id="foto">
  <input type="file" id="file" accept="image/*" style="display:none">
  <label for="file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; max-width: 35%;" id="labelBoton_elegirFoto">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
    <path d="M0 0h24v24H0V0z" fill="none"></path>
    <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
   </svg>ELEGIR FOTO</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; max-width: 30%; width: 100%; margin-top: var(--lumo-space-xl); max-height: 30%;" id="vL_estilosArtista">
  <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_estilosArtista">Estilos del artista:</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 105%; overflow-y:scroll; max-height: 60%; padding: var(--lumo-space-s); border: 1px solid #FFFFFF; height: 100%;" id="hL_estilos">
   <vista-estilos style="width: 100%;" id="vistaEstilos"></vista-estilos>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <button style="width:100%; max-width: 16%; max-height: 6.5%; border:none; cursor:pointer; border-radius: 500px; color:#121212; padding: 8px 34px; font-weight:700; letter-spacing:1.76px; line-height:18px; background-color:#FFFFFF; align-self: center; margin-top: var(--lumo-space-l); height: 100%; min-height: 6.5%; margin-bottom: var(--lumo-space-xl);" id="button_modificarArtista" class="registro">MODIFICAR ARTISTA</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
