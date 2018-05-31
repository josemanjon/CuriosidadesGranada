package com.example.jose.curiosidadesgranada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends Activity {

    String[] textos = {
            " Según la profesora María Teresa Hontoria Puentes Uriel, es el Fuego de Dios, " +
                    "encargado de proteger las tierras y los templos. Tras el Concilio Vaticano del" +
                    " año 745, el Papa Zacarías prohibió, entre otros, el nombre del arcángel" +
                    " Uriel.\n\n" +
                    " En nuestra iglesia Catedral aparece coronando una de sus torres para combatir" +
                    " la ira, la desobediencia, el odio de los hombres y convertirlo en virtudes" +
                    " como la dulzura o la paciencia. Custodia la entrada al templo sagrado," +
                    " vence al mal con su hoja de laurel en la mano y guía a la ciudad, con su luz," +
                    " hacia Dios.\n\n" +
                    " Su ubicación tampoco es arbitraria, pues además está mirando hacia lo que fue" +
                    " la antigua universidad, hoy Palacio Arzobispal, fundada en 1531 para enseñar," +
                    " a través de la razón, el cristianismo a los moriscos allí albergados.\n\n" +
                    " Una mirada vigilante los observa desde el cielo…\n\n" +
                    " Localización: https://www.google.es/maps/place/Catedral+de+Granada/@37.1762085,-3.6013077,17z/data=!4m8!1m2!2m1!1scatedral+de+granada!3m4!1s0xd71fcbfb1836ba9:0x70fefb4be53951c2!8m2!3d37.1765903!4d-3.5990652",

            " Desde el puente verde en Granada, los neveros forjaron esta senda a golpe de sudor," +
                    " alpargatas y herraduras hasta las altas cumbres para bajar su frescor en" +
                    " forma de bloques de hielo con que combatir los tórridos veranos. El tramo" +
                    " que recorremos se extiende desde el Collado de las Sabinas, a unos 2300 m de" +
                    " altitud, hasta El Purche a 1481 metros. Usada también como vía pecuaria para" +
                    " trashumancia de reses bravas hasta Sierra Morena.\n\n" +
                    " En los años 30 existían unos hombres que recogían nieve en las cumbres" +
                    " de Sierra Nevada para venderla en la ciudad de Granada.\n\n" +
                    " Estos hombres con sus mulas de carga: capachos, seroncillos de pleita forrada" +
                    " de anea, serones de esparto y una tabla, el \"barbero\", para tapar la nieve" +
                    " y poner la manta.\n\n" +
                    " Localización: www.google.es/maps/place/Camino+de+los+Neveros,+Granada/@37.1575921,-3.5884393,15z/data=!3m1!4b1!4m5!3m4!1s0xd71e4aa9dd89729:0x8a47ee36a928083b!8m2!3d37.1563558!4d-3.5800038",

            " Entre las 16 campanas que forman actualmente el campanario de la Catedral hay curiosas" +
                    " anécdotas. Todas, excepto la Gorda, se pueden echar al volteo. La mayoría se" +
                    " han rajado en varias ocasiones y ha habido que refundirlas, incluso una ha" +
                    " sido rehecha hasta en cinco ocasiones. Su origen es muy variado: dos de ellas" +
                    " son góticas, anteriores al año 1500; una de ellas fue regalada por los Reyes" +
                    " Católicos; otra procede de la torre Turpiana, demolida en 1588; dos son de" +
                    " la torre de San Jerónimo derribada por los franceses en 1810; una más es de" +
                    " la iglesia demolida de San Gil (1868); incluso hay una que fue refundida con" +
                    " trozos de campanas compradas a varios pueblos de los alrededores.\n\n" +
                    " Hay tres campanas con tendencias “homicidas”. Una de ellas está situada" +
                    " en la fachada de la calle de la Cárcel; en el año 1761 desprendió su badajo," +
                    " de casi un metro de largo y muchos kilos de peso, y lo lanzó sobre el tejado" +
                    " de la vivienda de Joaquín Dávila y Ponce de León. Destrozó parte del armazón," +
                    " pero no causó daños personales. Pocos meses después, el mismo badajo volvió" +
                    " a desprenderse y penetró aún más profundo en el tejado del edificio del que" +
                    " hoy es palacio de Niñas Nobles. Su dueño entendió aquello como un aviso por" +
                    " sus muchos pecados y no esperó a que el badajo lo matara. Abandonó esta casa" +
                    " para siempre.\n\n" +
                    " Unos años después, en 1808, tocó el turno a la campana Cuchillera o" +
                    " San Bartolomé, situada en la cara del pie de la Torre, la que mira al" +
                    " suroeste. Una mujer campanera oyó gritos en la calle; había dos muchachos" +
                    " peleándose. La mujer se asomó a curiosear mientras las campanas estaban al" +
                    " vuelo. Tuvo la mala fortuna de no calcular bien y el borde de la campana le" +
                    " dio un golpe que le abrió la cabeza y la dejó muerta al instante.\n\n" +
                    " La tercera campana que se cobró víctima humana también está situada en el" +
                    " lateral de la calle de la Cárcel. El suceso ocurrió el 4 de marzo de 1890." +
                    " La historia cuenta que un campanero se descuidó de tal manera que la campana" +
                    " al vuelo se lo llevó por delante y lo arrojó al vacío de la calle. También" +
                    " murió en el acto. La campana fue “condenada” a no tañer durante cien años y" +
                    " un día.\n\n" +
                    " Localización: https://www.google.es/maps/place/Catedral+de+Granada/@37.1762085,-3.6013077,17z/data=!4m8!1m2!2m1!1scatedral+de+granada!3m4!1s0xd71fcbfb1836ba9:0x70fefb4be53951c2!8m2!3d37.1765903!4d-3.5990652",

            " No era nueva en Granada esa costumbre de que personajes ilustres hicieran de Reyes" +
                    " Magos y el ejemplo más sonado lo tenemos en el retablo que Felipe Bigarny" +
                    " nos dejó en la Capilla Real. En la escena central aparece la Adoración de" +
                    " los Reyes en la que figura como Rey Gaspar el mismísimo Carlos V joven" +
                    " llevando incienso. Carlos V fue para Granada un auténtico Rey Mago que se" +
                    " mostró encantado de traer regalos, que hoy son buena parte de nuestro" +
                    " patrimonio y fuentes de ingresos: el turismo y la Universidad. El labio" +
                    " inferior colgón es el sello inconfundible de los Austrias. El Rey Gaspar" +
                    " Carlos nos regaló la Universidad de Granada.\n\n" +
                    " Localización: https://www.google.es/maps/place/Capilla+Real+de+Granada/@37.1763713,-3.600795,17z/data=!4m12!1m6!3m5!1s0xd71fcbeffdb3f25:0x63c97b192b23059b!2sCapilla+Real+de+Granada!8m2!3d37.1763713!4d-3.5986063!3m4!1s0xd71fcbeffdb3f25:0x63c97b192b23059b!8m2!3d37.1763713!4d-3.5986063",

            " Un restaurador encontró hace algunos años, mientras reparaba un artesonado mudéjar" +
                    " en el Museo de la Alhambra, una carta de amor escrita hace casi un siglo," +
                    " en la que un tal Pepe se dirigía amorosamente a una tal Emilia.\n\n" +
                    " Tras 92 años, la carta de amor que Pepe escribió a su amada Emilia en 1921" +
                    " ha salido a la luz. Los trabajos de documentación del Museo de la Alhambra" +
                    " la descubrieron el 14 de junio de 2013, escondida en el hueco de un" +
                    " artesanado mudéjar de la desaparecida iglesia de san Gil de Granada. Ese" +
                    " templo se encontraba en la Calle Elvira y desapreció a finales del XIX.\n\n" +
                    " La carta, escrita un lunes 29 de agosto, en un papel sencillo y con pobre" +
                    " ortografía, contaba a Emilia que le mandarían con un recadero otra misiva" +
                    " junto a un racimo de uvas dirigido a un tal don Antonio. El autor de la" +
                    " misiva fue Pepe, vecino del municipio alpujarreño de Sorvilán.\n\n" +
                    " Localización: https://www.google.es/maps/place/Museo+de+Bellas+Artes+de+Granada/@37.1755776,-3.5919465,17z/data=!4m8!1m2!2m1!1sMuseo+de+la+Alhambra!3m4!1s0x0:0xc16fafd9a41efead!8m2!3d37.176725!4d-3.5895581",

            " La casa de Castril se construyo sobre los cimientos de un palacio árabe. Los Reyes" +
                    " Católicos para recompensar a su secretario Hernando Zafra le permitieron" +
                    " construir su casa aquí.\n\n" +
                    " Cuenta la leyenda que Zafra vivía con su hija Elvira de 18 años, ya que" +
                    " enviudó. Elvira se enamoró de Alfonso de Quintanilla el hijo de una familia" +
                    " enemiga de Zafra.\n\n" +
                    " Estos se veían algunas noches en su habitación con la ayuda de un paje, una" +
                    " de estas noches estuvieron apunto de ser sorprendidos por Zafra pero a Alonso" +
                    " le dio tiempo a escapar, cuando el padre de Elvira abrió la puerta encontró" +
                    " a su hija medio desnuda al lado del paje que les ayudaba. Elvira fue" +
                    " encerrada en su habitación y su padre tapió la habitación. Así sigue. Un" +
                    " día sin poder soportarlo más acabó con su vida con un potente veneno.\n\n" +
                    " Actualmente es la sede del Museo Arqueológico y Etnológico de Granada.\n\n" +
                    " Localización: www.google.es/maps/place/Casa+de+Castril/@37.1787036,-3.5938595,17z/data=!4m12!1m6!3m5!1s0xd71fcb8074ac16d:0x22ed4f6cb34f9228!2sCasa+de+Castril!8m2!3d37.1787036!4d-3.5916708!3m4!1s0xd71fcb8074ac16d:0x22ed4f6cb34f9228!8m2!3d37.1787036!4d-3.5916708",

            " Los famosos versos grabados en el muro al pie de la Torre de la Vela que expresan" +
                    " \"que no hay en la vida nada, como la pena de ser ciego en Granada\" hicieron" +
                    " famoso a Francisco de Asís de Icaza. \n\n" +
                    " Una mujer llamada Beatriz de León y un invidente que pedía limosna arrodillado" +
                    " y en silencio junto a la Puerta de la Justicia en los días de Ángel Ganivet," +
                    " provocaron el mayor de los piropos para Granada.\n\n" +
                    " Los versos grabados en el muro de la Alhambra hicieron famoso a su autor," +
                    " el poeta mejicano nacido en 1863, Francisco de Asís de Icaza: Dale limosna" +
                    " mujer /que no hay en la vida nada / como la pena de ser / ciego en Granada.\n\n" +
                    " Localización: www.google.es/maps/place/Alhambra/@37.1760783,-3.59033,17z/data=!4m12!1m6!3m5!1s0xd71fcb7977fb93b:0x808dd1ef1221a27f!2sAlhambra!8m2!3d37.1760783!4d-3.5881413!3m4!1s0xd71fcb7977fb93b:0x808dd1ef1221a27f!8m2!3d37.1760783!4d-3.5881413",

            " Alonso Cano fue el gran genio de la catedral de Granada. Su obra maestra son los" +
                    " siete cuadros de la vida de la Virgen María que están en el Retablo central." +
                    " El cuadro de la Anunciacion sólo tiene esbozado el Espíritu Santo, representado" +
                    " con una paloma. Y es que el artista pensó en que, al caer la tarde, el reflejo" +
                    " de la vidriera de la fachada proyectara un haz de luz que representara esa" +
                    " paloma sobre la imagen de la Virgen. Casi nadie en la catedral conoce esta" +
                    " historia pero representa muy bien al gran artista granadino fallecido hace" +
                    " 350 años.\n\n" +
                    " Localización: https://www.google.es/maps/search/catedral+de+granada/@37.1762085,-3.6013077,17z/data=!3m1!4b1",

            " En su retirada forzosa, el mariscal francés Jean de Dieu Soult ordenó volar por los" +
                    " aires las fortificaciones de la Alhambra de Granada. Entre el mito y la" +
                    " realidad, las torres del recinto fueron explotando una tras otra hasta" +
                    " que, cerca ya de los palacios nazaríes, el cabo de Inválidos José García" +
                    " obstaculizó el hilo de pólvora con su propio cuerpo. Su hazaña evitó una" +
                    " pérdida histórica, no así las otras muchas que sufrió el patrimonio cultural" +
                    " español durante aquella guerra, donde incluso los aliados ingleses" +
                    " participaron del expolio.\n\n" +
                    " El cabo José García pertenecía al Cuerpo de Inválidos de España.\n\n" +
                    "Dentro del monumento granadino, en el Patio de los Aljibes, hoy se conserva" +
                    " una placa que recuerda la hazaña de este soldado: «A la memoria del cabo" +
                    " de \"Inválidos\" José García que, con riesgo de perder la vida, salvó la" +
                    " Reina de los Alcázares y torres de la Alambra en 1812»\n\n" +
                    " Localización: www.google.es/maps/place/Alhambra/@37.1760783,-3.59033,17z/data=!4m12!1m6!3m5!1s0xd71fcb7977fb93b:0x808dd1ef1221a27f!2sAlhambra!8m2!3d37.1760783!4d-3.5881413!3m4!1s0xd71fcb7977fb93b:0x808dd1ef1221a27f!8m2!3d37.1760783!4d-3.5881413",

            " La que llegaría a ser emperatriz de Francia, nacía en el barrio de la Magdalena," +
                    " el cinco de mayo de 1826. La madre, doña Manuela Kirpatrik, temiendo las" +
                    " sacudidas del seísmo, ordenó que en el jardín de su casona, en el número 12" +
                    " de la calle de Gracia, instalaran una tienda de campaña, donde nació la niña," +
                    " que recibió el nombre de su padrino Eugenio de Montijo, hermano de su padre," +
                    " don Cipriano Guzmán Palafox y Portocarrero, conde de Teba, marqués de Ardales" +
                    " y Grande de España.\n\n" +
                    " Residían en Granada, desde 1823, procedentes de Santiago de Compostela donde" +
                    " habían sufrido destierro por conspirar en pro de la causa liberal. Un año" +
                    " antes, el 25 de enero de 1825, los condes habían tenido su primera hija," +
                    " a quien llamaron Francisca de Sales, Paca en la intimidad, que andando el" +
                    " tiempo sería la VIII duquesa de Berwick y la XV duquesa de Alba.\n\n" +
                    " En 1830, los condes de Teba se trasladaron a Madrid. Con su partida la" +
                    " sociedad granadina perdió un importante centro de reunión, donde conspiraban" +
                    " gentes del bando liberal, entre ellas Mariana de Pineda.\n\n" +
                    " Localización: www.google.es/maps/place/Calle+Gracia,+12,+18002+Granada/@37.1745445,-3.6042237,17z/data=!4m13!1m7!3m6!1s0xd71fc958e67401d:0x8cf7bd4db5a9f92a!2sCalle+Gracia,+12,+18002+Granada!3b1!8m2!3d37.1745445!4d-3.602035!3m4!1s0xd71fc958e67401d:0x8cf7bd4db5a9f92a!8m2!3d37.1745445!4d-3.602035",

            " Toda La Alhambra es un gigante reloj solar, construido de tal modo que a mediodía la" +
                    " sombra divide por la mitad todas las estancias. Podremos seguir el paso de" +
                    " las horas fijándonos en la trayectoria de la sombra de las estancias," +
                    " especialmente en invierto, debido a la baja órbita del sol.\n\n" +
                    " Así pues, a través de sus estancias podríamos seguir el transcurso de" +
                    " las horas del día según avanza el astro rey por el firmamento, reflejado en" +
                    " sus baldosas. El fenómeno se hace especialmente patente al medio día, cuando" +
                    " las estancias quedan divididas exactamente por la mitad, como efecto de la" +
                    " sombra.\n\n" +
                    " Localización: https://www.google.es/maps/place/Alhambra/@37.1760783,-3.59033,17z/data=!3m1!4b1!4m5!3m4!1s0xd71fcb7977fb93b:0x808dd1ef1221a27f!8m2!3d37.1760783!4d-3.5881413",

            " Así se conocía popularmente la calle Acera del Darro. El río Darro, estaba cubierto" +
                    " por adoquines, porque entre otras cosas, el ingeniero Mac Adan no hábía" +
                    " inventado el asfalto, y porque en aquellos tiempos había carros. Fueron" +
                    " asfaltando sobre los adoquines, y la última parte que quedó por asfaltar era" +
                    " lo que ahora se llama Acera del Darro, un auténtico martirio para los coches.\n\n" +
                    " Su asfaltado se produjo hará no más de 50 o 55 años y la gente le llamaba" +
                    " \"la Filomatic\" porque daba \"gustirrinín\" pasar por ella después de" +
                    " asfaltada. Como si acabaran de \"afeitar la calle\"\n\n" +
                    " El margen izquierdo de la Acera del Darro, se la llamaba el \"tontódromo\"," +
                    " porque era donde se paseaba la gente aburrida las tardes de los domingos." +
                    " El margen derecho sigue llamándose Acera del Darro.\n\n" +
                    " Localización: www.google.es/maps/place/Calle+Acera+del+Darro,+18005+Granada/@37.170822,-3.6004204,17z/data=!4m13!1m7!3m6!1s0xd71fcbc5b854109:0x9c9881e9b37b710b!2sCalle+Acera+del+Darro,+18005+Granada!3b1!8m2!3d37.170822!4d-3.5982317!3m4!1s0xd71fcbc5b854109:0x9c9881e9b37b710b!8m2!3d37.170822!4d-3.5982317",

            " La única calle del mundo dedicada a los vagos está en Granada. Sabemos que no" +
                    " trabajaban pero comían pan cocido en un pequeño horno. Tiene 30 metros," +
                    " es toda de escalones y mejoraría la convivencia.\n\n" +
                    " A pesar de estar situada en lugar muy concurrido cercano al Clínico y a" +
                    " la Facultad de Medicina, muchos granadinos pasan por su lado pero no saben" +
                    " dónde está la curiosa y antiquísima calle. Es la más corta de la ciudad, no" +
                    " mide más de 30 metros y toda ella está llena de escalones, habiéndole contado" +
                    " por lo menos 25 y bastante empinados. O sea, no apta precisamente para ser" +
                    " muy paseada por ciudadanos perezosos. La calle Hornillo de Vagos es todo un" +
                    " homenaje a esa maravillosa \"profesión\" tan de moda, mediante la cual" +
                    " muchos de sus practicantes, bien por vocación, bien por afición, por sus" +
                    " felices rentas heredadas, o por la alcurnia de su linaje adornado de" +
                    " apellidos ilustres, viven del limosnero subsidio de papá, del cuento o de" +
                    " los despreciables y barriobajeros platós televisivos, que para mí ni" +
                    " siquiera tienen la categoría que la Literatura le atribuye al noble género" +
                    " de cuento como narración breve de hechos fabulosos, imaginarios o reales." +
                    " No viven del cuento sino de la basura, la ignorancia y el morbo del" +
                    " 'escoriaespectador'.\n\n" +
                    " Localización: www.google.es/maps/place/Calle+Hornillo+de+Vagos,+18012+Granada/@37.1866665,-3.6076416,17z/data=!4m13!1m7!3m6!1s0xd71fce8de7c8e17:0x31071a6af45a6799!2sCalle+Hornillo+de+Vagos,+18012+Granada!3b1!8m2!3d37.1866665!4d-3.6054529!3m4!1s0xd71fce8de7c8e17:0x31071a6af45a6799!8m2!3d37.1866665!4d-3.6054529",

            " Y fue además la última mujer ajusticiada por garrote vil en España. El 18 de marzo" +
                    " de 1831 irrumpió en su casa la policía. Mariana Pineda fue acusada de tener" +
                    " en su poder una bandera que simbolizaba la lucha contra la monarquía. Una" +
                    " extraña bandera inacabada y con unas letras que según sus acusadores tenían" +
                    " mucho sentido pero que, probablemente, fue colocada en casa de Mariana por" +
                    " la misma policía.\n\n" +
                    " En verdad lo que querían quienes la detuvieron era que Mariana delatara a" +
                    " los principales cabecillas de la causa liberal, pensando que una mujer no" +
                    " podía ser un elemento activo en la lucha política.\n\n" +
                    " Mariana fue condenada a muerte.\n\n" +
                    " El 26 de mayo de 1831, con tan sólo veintiséis años de edad, Mariana Pineda" +
                    " era ejecutada en el Campo del Triunfo de Granada. La ejecución, que pretendía" +
                    " ser un escarmiento y un aviso a la causa liberal, convirtió a Mariana en" +
                    " víctima y mártir.\n\n" +
                    " Después de que su cuerpo fuera trasladado en distintas ocasiones, finalmente" +
                    " encontró el descanso eterno en 1856 cuando fue enterrada en la cripta de la" +
                    " catedral de Granada.\n\n" +
                    " Localización: www.google.es/maps/search/catedral+de+granada/@37.1762085,-3.6013077,17z/data=!3m1!4b1",

            " Toma su nombre de un homenaje a la industria de las colchas, afamadas en Granada por" +
                    " su buena calidad. La calle sufrió un pavoroso incendio en 1859. Hay un dicho" +
                    " muy conocido en esta ciudad que dice \"eres más delicado que la calle de la" +
                    " Colcha\". Parece ser que, en cierta ocasión, desde una ventana cayó un tarta" +
                    " de bizcocho y merengue que vino a darle en la cabeza a un viandante, de" +
                    " resultas de cuyo impacto le ocasionó, instantánea y sorprendentemente, la" +
                    " muerte. Otras fuentes afirman, sin embargo, que esta expresión tan granaína" +
                    " suele utilizarse para señalar que alguien es muy tiquismiquis o escrupuloso." +
                    " El origen de la expresión, según esas fuentes, es bastante antiguo, y se" +
                    " remonta a los tiempos en los que el tranvía circulaba por las calles" +
                    " Granadinas.\n\n" +
                    " La Calle de la Colcha, que efectivamente existe, es una calle situada a muy" +
                    " pocos metros de Plaza Nueva y es extremadamente angosta. Antiguamente y al" +
                    " ser tan estrecha, si se cruzaban el mismo momento un peatón y el tranvía se" +
                    " producía un momento bastante “delicado”, de ahí el dicho de \"eres más" +
                    " delicado que la Calle la Colcha”.\n\n" +
                    " Una tercera interpretación es menos prosaica y afirma que esa expresión" +
                    " recuerda a que los callaos que la tapizan y adornan se levantaban por" +
                    " menos de nada.\n\n" +
                    " Esa vía se llamó antes de Castro y Serrano, en homenaje al médico granadino" +
                    " que ejerció como cronista y periodista y fie, además, miembro de la Real" +
                    " Academia de la Lengua Españoa y de la Academia de Bellas Artes de san" +
                    " Fernando.\n\n" +
                    " Localización: https://www.google.es/maps/place/Calle+Colcha,+18009+Granada/@37.1759509,-3.5987503,17z/data=!4m13!1m7!3m6!1s0xd71fcbf2a8f4bf5:0x8c5a6adee94d435d!2sCalle+Colcha,+18009+Granada!3b1!8m2!3d37.1759509!4d-3.5965616!3m4!1s0xd71fcbf2a8f4bf5:0x8c5a6adee94d435d!8m2!3d37.1759509!4d-3.5965616",

            " La calle Niños Luchando está en pleno centro, entre el Registro de la Propiedad y el" +
                    " convento de la Encarnación, muy cerca de la Facultad de Derecho. Su nombre" +
                    " sorprende a muchos, pero pocos saben dar una respuesta clara a de dónde" +
                    " viene. La clave es una curiosa leyenda muy apropiada para tiempos de" +
                    " crisis.\n\n" +
                    " La historia la recoge Julio Belza y Ruiz de la Fuente en su ensayo 'Las" +
                    " calles de Granada', y dice así: “En fin, todo queda reducido a una" +
                    " habitación, donde dos niños juegan y en el calor de la ficticia pelea" +
                    " arremeten contra un tabique tan endeble y viejo que se viene abajo en" +
                    " parte, cayendo entre ladrillos y yesones, un chorro de onzas y doblones“.\n\n" +
                    " La historia sigue con que el padre, cuya economía era de las de crisis" +
                    " permanente, se lleva tal alegría que manda hacer un bajorrelieve de mármol" +
                    " con la imagen de dos niños peleando y lo pone en la fachada de la casa." +
                    " Andando el tiempo, la imagen acabó bautizando la calle. Que la placa" +
                    " existiese o no, no está comprobado, aunque en las muchas reformas que acabó" +
                    " sufriendo la calle en los siglos XIX y XX bien pudo perderse.\n\n" +
                    " Localización: www.google.es/maps/place/Calle+Niños+Luchando,+18001+Granada/@37.1788321,-3.6032885,17z/data=!3m1!4b1!4m5!3m4!1s0xd71fcc00445b383:0x7c90884b5f9776e9!8m2!3d37.1788321!4d-3.6010998",

            " El Paseo del Salón discurre paralelo al Río Genil y se extiende desde el Puente" +
                    " Romano, y la plaza del Humilladero, hasta la fuente de los cuatro Leones," +
                    " a la altura del Kiosco de Las Titas. Ahí comienza el Paseo de la Bomba, al" +
                    " que estuvo unido hasta principios del siglo XIX.\n\n" +
                    " Los jardines históricos, que se sitúan en el margen derecho del río," +
                    " formaban el límite de la ciudad hacía el sureste. En 1612 en esta orilla" +
                    " del río Genil existía una gran alameda a modo de corredor, llamado Acera" +
                    " de los Lecheros.\n\n" +
                    " La primera actuación sobre estos jardines tuvo lugar en la segunda mitad del" +
                    " siglo XVIII, con la plantación de álamos para afianzar el terreno, debido" +
                    " a que las continuas riadas inundaban y destruían todo a su paso.\n\n" +
                    " Fue con la invasión francesa de Granada en 1810 cuando se proyectó este" +
                    " espacio, confiriéndole una fisonomía propia de los jardines públicos" +
                    " franceses, y se creó un jardín botánico que fue destruido por los españoles" +
                    " al marcharse el General Horacio Sebastiani.\n\n" +
                    " La denominación de Paseo del Salón proviene del término francés “Salle de" +
                    " sejour” o sala de descanso.\n\n" +
                    " Localización: www.google.es/maps/place/Biblioteca+Pública+Municipal+del+Salón/@37.1729321,-3.6065947,15z/data=!4m8!1m2!2m1!1sorigen+del+paseo+del+salon!3m4!1s0x0:0x13a9ca626c69314d!8m2!3d37.1689989!4d-3.5955334",

            " En Xolair, la sierra que hoy conocemos por el nombre de Sierra Nevada hay un pico" +
                    " que se alza por encima de todos los demás. Se trata del pico Mulhacén, el" +
                    " pico más alto de toda la península ibérica.\n\n" +
                    " El nombre del pico Mulhacén hace honor a una gran figura del antiguo reino" +
                    " moro de Granada, el Reino Nazarí. Se trata de Muley Hacén, castellanización" +
                    " del nombre Mulay Hasan. Estaba casado con la reina Aixa, con la que tenía" +
                    " un hijo llamado Boabdil por los cristianos. El rey se enamoró de una de las" +
                    " esclavas cristianas de la Alhambra. A ella se le conoció por el nombre árabe" +
                    " que recibió, Zoraya. A raíz de este amor la reina Aixa incitó a su hijo a" +
                    " unirse a los máximos enemigos del reino, los abencerrajes, y arrebatarle el" +
                    " trono al rey. Esto llevó a unas luchas por el trono de la Alhambra que sólo" +
                    " acabarían cuando el reino cayó en manos cristianas.\n\n" +
                    " La leyenda cuenta que Muley Hacén, se retiró a vivir oculto en una alcazaba" +
                    " en Xolair, hoy Sierra Nevada. Vivió sus últimos años en la alcazaba de" +
                    " Mondújar, un pueblo situado en el maravilloso enclave del Valle de Lecrín.\n\n" +
                    " Allí, dejó pasar sus días junto a la bella Zoraya y los hijos que tuvo con" +
                    " ella. Se dice que vivía siempre triste, encerrado en la torre más alta de" +
                    " la alcazaba.\n\n" +
                    " Cuando se acercó su final pidió que allí lo enterraran, donde nadie pudiera" +
                    " jamás encontrarle. Zoraya, enterró a Muley Hacén en lo más alto de aquellos" +
                    " montes, entre la nieve.\n\n" +
                    " Localización: www.google.es/maps/place/Mulhacén/@37.053515,-3.3285085,14z/data=!4m13!1m7!3m6!1s0xd71c4eea8f37ce5:0xeadd7134cf3c0b65!2zTXVsaGFjw6lu!3b1!8m2!3d37.0535168!4d-3.3109989!3m4!1s0xd71c4eea8f37ce5:0xeadd7134cf3c0b65!8m2!3d37.0535168!4d-3.3109989",

            " Fue un 5 de Enero de 1912 cuando Granada contempló la primera cabalgata de Reyes" +
                    " Magos que haya desfilado jamás, no sólo por las calles de España, sino," +
                    " probablemente, por las calles de todo el mundo.\n\n" +
                    " Pese a que Alcoy asegura haber organizado la primera, en las averiguaciones" +
                    " llevadas a cabo por el escritor e investigador de temas granadinos, Manuel" +
                    " J. Anguita Castillo, éste pudo comprobar que tal afirmación no se ajusta a" +
                    " la realidad, puesto que lo que Alcoy organizaba era una vuelta por los" +
                    " alrededores del templo en donde recibían adoración los Reyes Magos.\n\n" +
                    " Las calles de Granada fueron invadidas hace 101 años para presenciar el" +
                    " paso de una Cabalgata que se convirtió en objeto de una gran campaña" +
                    " publicitaria para recoger regalos para los niños pobres de la ciudad, según" +
                    " recoge el presidente de la Asociación Granada Histórica Cultural, César" +
                    " Girón, en su libro “Miscelánea de Granada “.\n\n" +
                    " El origen de la Cabalgata se remonta a finales del siglo XIX, cuando barrios" +
                    " como el Fargue, en Granada , celebraban representaciones teatrales sobre la" +
                    " llegada y adoración de los Magos ante el Niño.\n\n" +
                    " Localización: Las carrozas están en dependencias municipales de Urbanismo y Mantenimiento en Gran Capitán",

            " El primer cuerpo de bomberos oficial se sitúa en Granada. En 1823 la Milicia" +
                    " Nacional de esta ciudad andaluza crea la Compañía de Zapadores. Esta" +
                    " unidad tenía la misión de apagar los fuegos de la ciudad. El municipio" +
                    " costeó las máquinas y demás útiles, organizó un grupo de 160 hombres," +
                    " entre ellos 87 albañiles, 45 carpinteros y 28 fontaneros que puso a las" +
                    " órdenes de José Ruiz Pérez. El capitán los repartió en tareas de escuadras" +
                    " de corte, desalojo, cubetas, bombas y también banda de música, tambores y" +
                    " cornetas, sanitarios y médicos. Su cuartel general sería el antiguo convento" +
                    " del Carmen, curiosamente destruido tras un incendio declarado en 1723. El" +
                    " 20 de febrero de 1821 en la ciudad de Granada se redactó el primer reglamento" +
                    " conocido de un servicio de bomberos en este país.\n\n" +
                    " Localización: www.google.es/maps/place/Parroquia+de+San+José/@37.1786171,-3.5983292,17z/data=!4m12!1m6!3m5!1s0xd71fcbf55569489:0x494b39f30e8776d9!2sParroquia+de+San+José!8m2!3d37.1786171!4d-3.5961405!3m4!1s0xd71fcbf55569489:0x494b39f30e8776d9!8m2!3d37.1786171!4d-3.5961405",

            " A principios de siglo, había dos cafés en la Plaza Bib-Rambla. En uno de ellos," +
                    " el “Café del Ratón”, tenían una curiosa costumbre para evitar a los" +
                    " clientes gorrones que se iban sin pagar. Cuando pedían café, el camarero" +
                    " daba la voz: “¡café!” y se acercaba otro compañero (el “echaor”) con una" +
                    " tetera con leche y otra con café, y los vertía en la taza del cliente. El" +
                    " camarero, temiendo que el cliente se lo bebiera y se fuera corriendo, pedía" +
                    " que pagara la consumición. Acto seguido el camarero, temiendo la pronta" +
                    " “ingestión y fuga” del pícaro cliente, le requería el pago inmediato, si" +
                    " este se demoraba más de lo preciso, el propio camarero extraía de la taza" +
                    " el café con una perilla de goma y una cánula y el recién servido café tornaba" +
                    " raudo y veloz a la tetera.\n\n",

            " Las recientes investigaciones realizadas en el monasterio de San Jerónimo de Granada" +
                    " por el Instituto Andaluz de Patrimonio han puesto de manifiesto que los" +
                    " restos conservados en la tumba del Gran Capitán no corresponden a Gonzalo" +
                    " Fernández de Córdoba, el ilustre militar nacido en Montilla.\n\n" +
                    " La versión más popular es que la tumba de Gonzalo Fernández de Córdoba y" +
                    " Herrera, el Gran Capitán (1453-1515), fue profanada por el general Horace" +
                    " Sabastiani, en 1812, en su huida de España. Profanó su tumba en la iglesia" +
                    " de San Jerónimo y también se llevó su cabeza.\n\n" +
                    " Localización: www.google.es/maps/place/Monasterio+de+San+Jerónimo/@37.1792288,-3.6060718,17z/data=!3m1!4b1!4m5!3m4!1s0xd71fceb0358430f:0xe4000e8aef0a8c58!8m2!3d37.1792288!4d-3.6038831",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        Intent intent = getIntent();

        String message = intent.getExtras().getString("posicion");
        Integer imagen = intent.getExtras().getInt("imagen");
        Integer pos = intent.getExtras().getInt("posicionDetalle");

        TextView textView = findViewById(R.id.tituloDetalle);
        textView.setText(message);

        ImageView imageView = findViewById(R.id.imagenDetalles);
        imageView.setImageResource(imagen);

        TextView detalles = findViewById(R.id.textoDetalle);
        detalles.setText(textos[pos]);

    }
}