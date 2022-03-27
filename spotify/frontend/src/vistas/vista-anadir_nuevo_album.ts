import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-canciones_del_album_administrador';

@customElement('vista-anadir_nuevo_album')
export class VistaAnadir_nuevo_album extends LitElement {
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
    	font-family: helvetica;
    	font-size: 1.1rem;
    	border: 1px solid #FFFFFF;
    	background-color:#121212;
    	outline-color: #FFFFFF;
    }

    .botonlabel label {
    	font-size:12px;
    }

    .botonlabel label:hover {
    	font-size:13px;
    }

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

    button {
    	font-size:12px;
    }

    button:hover {
    	font-size:13px;
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212;" class="fuentes" theme="spacing" id="vL_fondo">
 <vista-cabecera style="width: 100%; max-height: 10%;" id="vistaCabecera"></vista-cabecera>
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_anadeNuevoAlbum">Añade un nuevo álbum</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; max-width: 80%; align-self: center; max-height: 50%; height: 100%;" id="hL_cancionesDatosImagen">
  <vaadin-vertical-layout theme="spacing" style="max-width: 20%; width: 100%; align-items: center; align-self: flex-start; height: 100%; margin-right: var(--lumo-space-s);" class="boton-rectangulo" id="vL_cancionesAlbum">
   <label style="flex-shrink: 0; align-self: flex-start;" id="label_cancionesAlbum">Canciones del álbum</label>
   <vaadin-horizontal-layout theme="spacing" style="overflow-y:scroll; border: 1px solid #FFFFFF; height: 100%; max-height: 62%; width: 100%; padding: var(--lumo-space-s);" id="hL_cancionesDelAlbumAdministrador">
    <vista-canciones_del_album_administrador style="width: 100%;" id="vistaCanciones_del_album_administrador"></vista-canciones_del_album_administrador>
   </vaadin-horizontal-layout>
   <button style="align-self: center; width: 100%;" id="button_anadirCancion">AÑADIR CANCIÓN</button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="max-width: 60%; width: 100%; margin-right: var(--lumo-space-xl);" theme="spacing" id="vL_datosAlbum">
   <label style="flex-shrink: 0;" id="label_tituloAlbum">¿Cuál es el título del álbum?</label>
   <input type="text" placeholder="Pon un título al álbum." style="width: 100%; padding: 10px;" id="input_tituloAlbum">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_artistaAlbum">¿Qué artista(s) han creado el álbum?</label>
   <input type="text" placeholder="Pon el artisa(s) que ha creado el álbum." style="width: 100%; padding: 10px;" id="input_tituloAlbum1">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_fechaAlbum">¿Cual es la fecha de edición?</label>
   <input type="date" placeholder="Pon la fecha de edición del álbum." style="width: 100%; padding: 10px; " id="input_fechaAlbum">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 20%; width: 100%; align-items: center; align-self: flex-start; margin-top: var(--lumo-space-m);" id="vL_Imagen">
   <img style="max-width: 100%; max-height: 100%; border: 2px solid #FFFFFF;" src="https://i.scdn.co/image/ab67616d00001e020ec1f3493edc0c888ff2d57c" id="imagen">
   <input type="file" id="file" accept="image/*" style="display:none">
   <label for="file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; max-width: 65%;" id="label" class="bobnLabel_elegirFoto">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
    </svg>ELEGIR FOTO</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <button style="width:100%; max-width: 14%; max-height: 6.5%; border:none; cursor:pointer; border-radius: 500px; color:#121212; padding: 8px 34px; font-weight:700; letter-spacing:1.76px; line-height:18px; background-color:#FFFFFF; align-self: center; margin-top: var(--lumo-space-l); height: 100%; min-height: 6.5%; margin-bottom: var(--lumo-space-xl);" id="button_anadirAlbum" class="registro">AÑADIR ÁLBUM</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
