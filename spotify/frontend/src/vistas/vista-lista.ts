import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista')
export class VistaLista extends LitElement {
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

    .fuentes input {
    	color: #FFFFFF;
    	font-size: 1.1rem;
    	border: 1px solid #FFFFFF;
    	background-color:#121212;
    	outline-color: #FFFFFF;
    }

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

      .boton-rectangulo button {
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

      .boton-rectangulo button:hover {
    		border: 1px solid #FFFFFF; 

      }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%; width: 100%;" class="fuentes boton-rectangulo" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing-l" style="max-height: 100%; padding-top: 0px; padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll; width: 100%; height: 100%;" id="vL_cuerpo">
  <vaadin-horizontal-layout theme="spacing-l" style="max-height: 43%; width: 100%; padding: 0px;" id="hL_imagenTituloBotones">
   <img style="max-width: 100%; margin: 0px; max-height: 100%; height: 100%;" id="imagen">
   <vaadin-vertical-layout style="width: 100%; justify-content: space-between;" id="vL_tituloCreadorBotones">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: 0px;" id="vL_tituloCreador">
     <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1; margin-top: 0px;" id="label_titulo">Pop con Ñ Clásicos</label>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="hL_tituloAceptar">
      <input type="text" placeholder="Pon un nombre a la lista de reproducción." style="width: 100%; padding: 10px; max-width: 33%; margin: 0px;" id="input_titulo">
      <button style="align-self: center; width: 100%; max-width: 12%;" id="button_aceptar">ACEPTAR</button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" id="hL_labelCreador" style="padding: 0px; margin-right: 0px; margin-bottom: 0px; margin-left: 0px;">
      <label style="color:#A8A8A8; font-weight:400; align-self: flex-start; margin-left: 0px;" id="label_creador">Creador</label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin: 0px;" id="hL_botones">
     <button style="align-self: center; width: 12%; margin-left: 0px;" id="button_compartir">COMPARTIR</button>
     <button style="align-self: center; width: 100%; max-width: 12%;" id="button_modificar">MODIFICAR</button>
     <button style="align-self: center; width: 12%;" id="button_guardar">GUARDAR</button>
     <button style="align-self: center; width: 13%;" id="button_eliminar">ELIMINAR LISTA</button>
     <label style="color:#A8A8A8; font-weight:400; align-self: center;" id="label_fechaPublicacion">Publicado el 20/3/2022</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="justify-content: space-between; width: 100%;" id="hL_nCancionesAnadir">
   <label style="color:#A8A8A8; font-weight:400; align-self: flex-start; margin: 0px;" id="label_nCanciones">5 de 100 canciones</label>
   <button style="align-self: center; width: 12%;" id="button_anadirCancion">AÑADIR CANCIÓN</button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; max-height: 17%; height: 100%; margin-top: 0px; padding: 0px;" id="vL_cancionesDeListaAlbumListaeliminar"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
