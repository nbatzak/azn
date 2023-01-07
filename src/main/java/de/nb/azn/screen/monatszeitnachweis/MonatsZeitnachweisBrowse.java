package de.nb.azn.screen.monatszeitnachweis;

import io.jmix.ui.screen.*;
import de.nb.azn.entity.MonatsZeitnachweis;

@UiController("MonatsZeitnachweis.browse")
@UiDescriptor("monats-zeitnachweis-browse.xml")
@LookupComponent("monatsZeitnachweisesTable")
public class MonatsZeitnachweisBrowse extends StandardLookup<MonatsZeitnachweis> {
}