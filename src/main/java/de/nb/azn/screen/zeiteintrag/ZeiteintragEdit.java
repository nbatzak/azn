package de.nb.azn.screen.zeiteintrag;

import io.jmix.ui.screen.*;
import de.nb.azn.entity.Zeiteintrag;

@UiController("Zeiteintrag.edit")
@UiDescriptor("zeiteintrag-edit.xml")
@EditedEntityContainer("zeiteintragDc")
public class ZeiteintragEdit extends StandardEditor<Zeiteintrag> {
}