package de.nb.azn.screen.monatszeitnachweis;

import io.jmix.ui.screen.*;
import de.nb.azn.entity.MonatsZeitnachweis;

@UiController("MonatsZeitnachweis.edit")
@UiDescriptor("monats-zeitnachweis-edit.xml")
@EditedEntityContainer("monatsZeitnachweisDc")
public class MonatsZeitnachweisEdit extends StandardEditor<MonatsZeitnachweis> {
}