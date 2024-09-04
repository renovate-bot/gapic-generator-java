/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/card/v1/card.proto

// Protobuf Java Version: 3.25.4
package com.google.apps.card.v1;

public interface WidgetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.card.v1.Widget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Displays a text paragraph. Supports simple HTML formatted text. For more
   * information about formatting text, see
   * [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting)
   * and
   * [Formatting
   * text in Google Workspace
   * Add-ons](https://developers.google.com/apps-script/add-ons/concepts/widgets#text_formatting).
   *
   * For example, the following JSON creates a bolded text:
   * ```
   * "textParagraph": {
   *   "text": "  &lt;b&gt;bold text&lt;/b&gt;"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.TextParagraph text_paragraph = 1;</code>
   *
   * @return Whether the textParagraph field is set.
   */
  boolean hasTextParagraph();
  /**
   *
   *
   * <pre>
   * Displays a text paragraph. Supports simple HTML formatted text. For more
   * information about formatting text, see
   * [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting)
   * and
   * [Formatting
   * text in Google Workspace
   * Add-ons](https://developers.google.com/apps-script/add-ons/concepts/widgets#text_formatting).
   *
   * For example, the following JSON creates a bolded text:
   * ```
   * "textParagraph": {
   *   "text": "  &lt;b&gt;bold text&lt;/b&gt;"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.TextParagraph text_paragraph = 1;</code>
   *
   * @return The textParagraph.
   */
  com.google.apps.card.v1.TextParagraph getTextParagraph();
  /**
   *
   *
   * <pre>
   * Displays a text paragraph. Supports simple HTML formatted text. For more
   * information about formatting text, see
   * [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting)
   * and
   * [Formatting
   * text in Google Workspace
   * Add-ons](https://developers.google.com/apps-script/add-ons/concepts/widgets#text_formatting).
   *
   * For example, the following JSON creates a bolded text:
   * ```
   * "textParagraph": {
   *   "text": "  &lt;b&gt;bold text&lt;/b&gt;"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.TextParagraph text_paragraph = 1;</code>
   */
  com.google.apps.card.v1.TextParagraphOrBuilder getTextParagraphOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays an image.
   *
   * For example, the following JSON creates an image with alternative text:
   * ```
   * "image": {
   *   "imageUrl":
   *   "https://developers.google.com/workspace/chat/images/quickstart-app-avatar.png",
   *   "altText": "Chat app avatar"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Image image = 2;</code>
   *
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * Displays an image.
   *
   * For example, the following JSON creates an image with alternative text:
   * ```
   * "image": {
   *   "imageUrl":
   *   "https://developers.google.com/workspace/chat/images/quickstart-app-avatar.png",
   *   "altText": "Chat app avatar"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Image image = 2;</code>
   *
   * @return The image.
   */
  com.google.apps.card.v1.Image getImage();
  /**
   *
   *
   * <pre>
   * Displays an image.
   *
   * For example, the following JSON creates an image with alternative text:
   * ```
   * "image": {
   *   "imageUrl":
   *   "https://developers.google.com/workspace/chat/images/quickstart-app-avatar.png",
   *   "altText": "Chat app avatar"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Image image = 2;</code>
   */
  com.google.apps.card.v1.ImageOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays a decorated text item.
   *
   * For example, the following JSON creates a decorated text widget showing
   * email address:
   *
   * ```
   * "decoratedText": {
   *   "icon": {
   *     "knownIcon": "EMAIL"
   *   },
   *   "topLabel": "Email Address",
   *   "text": "sasha&#64;example.com",
   *   "bottomLabel": "This is a new Email address!",
   *   "switchControl": {
   *     "name": "has_send_welcome_email_to_sasha",
   *     "selected": false,
   *     "controlType": "CHECKBOX"
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.DecoratedText decorated_text = 3;</code>
   *
   * @return Whether the decoratedText field is set.
   */
  boolean hasDecoratedText();
  /**
   *
   *
   * <pre>
   * Displays a decorated text item.
   *
   * For example, the following JSON creates a decorated text widget showing
   * email address:
   *
   * ```
   * "decoratedText": {
   *   "icon": {
   *     "knownIcon": "EMAIL"
   *   },
   *   "topLabel": "Email Address",
   *   "text": "sasha&#64;example.com",
   *   "bottomLabel": "This is a new Email address!",
   *   "switchControl": {
   *     "name": "has_send_welcome_email_to_sasha",
   *     "selected": false,
   *     "controlType": "CHECKBOX"
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.DecoratedText decorated_text = 3;</code>
   *
   * @return The decoratedText.
   */
  com.google.apps.card.v1.DecoratedText getDecoratedText();
  /**
   *
   *
   * <pre>
   * Displays a decorated text item.
   *
   * For example, the following JSON creates a decorated text widget showing
   * email address:
   *
   * ```
   * "decoratedText": {
   *   "icon": {
   *     "knownIcon": "EMAIL"
   *   },
   *   "topLabel": "Email Address",
   *   "text": "sasha&#64;example.com",
   *   "bottomLabel": "This is a new Email address!",
   *   "switchControl": {
   *     "name": "has_send_welcome_email_to_sasha",
   *     "selected": false,
   *     "controlType": "CHECKBOX"
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.DecoratedText decorated_text = 3;</code>
   */
  com.google.apps.card.v1.DecoratedTextOrBuilder getDecoratedTextOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of buttons.
   *
   * For example, the following JSON creates two buttons. The first
   * is a blue text button and the second is an image button that opens a
   * link:
   * ```
   * "buttonList": {
   *   "buttons": [
   *     {
   *       "text": "Edit",
   *       "color": {
   *         "red": 0,
   *         "green": 0,
   *         "blue": 1,
   *         "alpha": 1
   *       },
   *       "disabled": true,
   *     },
   *     {
   *       "icon": {
   *         "knownIcon": "INVITE",
   *         "altText": "check calendar"
   *       },
   *       "onClick": {
   *         "openLink": {
   *           "url": "https://example.com/calendar"
   *         }
   *       }
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.ButtonList button_list = 4;</code>
   *
   * @return Whether the buttonList field is set.
   */
  boolean hasButtonList();
  /**
   *
   *
   * <pre>
   * A list of buttons.
   *
   * For example, the following JSON creates two buttons. The first
   * is a blue text button and the second is an image button that opens a
   * link:
   * ```
   * "buttonList": {
   *   "buttons": [
   *     {
   *       "text": "Edit",
   *       "color": {
   *         "red": 0,
   *         "green": 0,
   *         "blue": 1,
   *         "alpha": 1
   *       },
   *       "disabled": true,
   *     },
   *     {
   *       "icon": {
   *         "knownIcon": "INVITE",
   *         "altText": "check calendar"
   *       },
   *       "onClick": {
   *         "openLink": {
   *           "url": "https://example.com/calendar"
   *         }
   *       }
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.ButtonList button_list = 4;</code>
   *
   * @return The buttonList.
   */
  com.google.apps.card.v1.ButtonList getButtonList();
  /**
   *
   *
   * <pre>
   * A list of buttons.
   *
   * For example, the following JSON creates two buttons. The first
   * is a blue text button and the second is an image button that opens a
   * link:
   * ```
   * "buttonList": {
   *   "buttons": [
   *     {
   *       "text": "Edit",
   *       "color": {
   *         "red": 0,
   *         "green": 0,
   *         "blue": 1,
   *         "alpha": 1
   *       },
   *       "disabled": true,
   *     },
   *     {
   *       "icon": {
   *         "knownIcon": "INVITE",
   *         "altText": "check calendar"
   *       },
   *       "onClick": {
   *         "openLink": {
   *           "url": "https://example.com/calendar"
   *         }
   *       }
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.ButtonList button_list = 4;</code>
   */
  com.google.apps.card.v1.ButtonListOrBuilder getButtonListOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays a text box that users can type into.
   *
   * For example, the following JSON creates a text input for an email
   * address:
   *
   * ```
   * "textInput": {
   *   "name": "mailing_address",
   *   "label": "Mailing Address"
   * }
   * ```
   *
   * As another example, the following JSON creates a text input for a
   * programming language with static suggestions:
   * ```
   * "textInput": {
   *   "name": "preferred_programing_language",
   *   "label": "Preferred Language",
   *   "initialSuggestions": {
   *     "items": [
   *       {
   *         "text": "C++"
   *       },
   *       {
   *         "text": "Java"
   *       },
   *       {
   *         "text": "JavaScript"
   *       },
   *       {
   *         "text": "Python"
   *       }
   *     ]
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.TextInput text_input = 5;</code>
   *
   * @return Whether the textInput field is set.
   */
  boolean hasTextInput();
  /**
   *
   *
   * <pre>
   * Displays a text box that users can type into.
   *
   * For example, the following JSON creates a text input for an email
   * address:
   *
   * ```
   * "textInput": {
   *   "name": "mailing_address",
   *   "label": "Mailing Address"
   * }
   * ```
   *
   * As another example, the following JSON creates a text input for a
   * programming language with static suggestions:
   * ```
   * "textInput": {
   *   "name": "preferred_programing_language",
   *   "label": "Preferred Language",
   *   "initialSuggestions": {
   *     "items": [
   *       {
   *         "text": "C++"
   *       },
   *       {
   *         "text": "Java"
   *       },
   *       {
   *         "text": "JavaScript"
   *       },
   *       {
   *         "text": "Python"
   *       }
   *     ]
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.TextInput text_input = 5;</code>
   *
   * @return The textInput.
   */
  com.google.apps.card.v1.TextInput getTextInput();
  /**
   *
   *
   * <pre>
   * Displays a text box that users can type into.
   *
   * For example, the following JSON creates a text input for an email
   * address:
   *
   * ```
   * "textInput": {
   *   "name": "mailing_address",
   *   "label": "Mailing Address"
   * }
   * ```
   *
   * As another example, the following JSON creates a text input for a
   * programming language with static suggestions:
   * ```
   * "textInput": {
   *   "name": "preferred_programing_language",
   *   "label": "Preferred Language",
   *   "initialSuggestions": {
   *     "items": [
   *       {
   *         "text": "C++"
   *       },
   *       {
   *         "text": "Java"
   *       },
   *       {
   *         "text": "JavaScript"
   *       },
   *       {
   *         "text": "Python"
   *       }
   *     ]
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.TextInput text_input = 5;</code>
   */
  com.google.apps.card.v1.TextInputOrBuilder getTextInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays a selection control that lets users select items. Selection
   * controls can be checkboxes, radio buttons, switches, or dropdown menus.
   *
   * For example, the following JSON creates a dropdown menu that lets users
   * choose a size:
   *
   * ```
   * "selectionInput": {
   *   "name": "size",
   *   "label": "Size"
   *   "type": "DROPDOWN",
   *   "items": [
   *     {
   *       "text": "S",
   *       "value": "small",
   *       "selected": false
   *     },
   *     {
   *       "text": "M",
   *       "value": "medium",
   *       "selected": true
   *     },
   *     {
   *       "text": "L",
   *       "value": "large",
   *       "selected": false
   *     },
   *     {
   *       "text": "XL",
   *       "value": "extra_large",
   *       "selected": false
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.SelectionInput selection_input = 6;</code>
   *
   * @return Whether the selectionInput field is set.
   */
  boolean hasSelectionInput();
  /**
   *
   *
   * <pre>
   * Displays a selection control that lets users select items. Selection
   * controls can be checkboxes, radio buttons, switches, or dropdown menus.
   *
   * For example, the following JSON creates a dropdown menu that lets users
   * choose a size:
   *
   * ```
   * "selectionInput": {
   *   "name": "size",
   *   "label": "Size"
   *   "type": "DROPDOWN",
   *   "items": [
   *     {
   *       "text": "S",
   *       "value": "small",
   *       "selected": false
   *     },
   *     {
   *       "text": "M",
   *       "value": "medium",
   *       "selected": true
   *     },
   *     {
   *       "text": "L",
   *       "value": "large",
   *       "selected": false
   *     },
   *     {
   *       "text": "XL",
   *       "value": "extra_large",
   *       "selected": false
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.SelectionInput selection_input = 6;</code>
   *
   * @return The selectionInput.
   */
  com.google.apps.card.v1.SelectionInput getSelectionInput();
  /**
   *
   *
   * <pre>
   * Displays a selection control that lets users select items. Selection
   * controls can be checkboxes, radio buttons, switches, or dropdown menus.
   *
   * For example, the following JSON creates a dropdown menu that lets users
   * choose a size:
   *
   * ```
   * "selectionInput": {
   *   "name": "size",
   *   "label": "Size"
   *   "type": "DROPDOWN",
   *   "items": [
   *     {
   *       "text": "S",
   *       "value": "small",
   *       "selected": false
   *     },
   *     {
   *       "text": "M",
   *       "value": "medium",
   *       "selected": true
   *     },
   *     {
   *       "text": "L",
   *       "value": "large",
   *       "selected": false
   *     },
   *     {
   *       "text": "XL",
   *       "value": "extra_large",
   *       "selected": false
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.SelectionInput selection_input = 6;</code>
   */
  com.google.apps.card.v1.SelectionInputOrBuilder getSelectionInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays a widget that lets users input a date, time, or date and time.
   *
   * For example, the following JSON creates a date time picker to schedule an
   * appointment:
   *
   *
   * ```
   * "dateTimePicker": {
   *   "name": "appointment_time",
   *   "label": "Book your appointment at:",
   *   "type": "DATE_AND_TIME",
   *   "valueMsEpoch": "796435200000"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.DateTimePicker date_time_picker = 7;</code>
   *
   * @return Whether the dateTimePicker field is set.
   */
  boolean hasDateTimePicker();
  /**
   *
   *
   * <pre>
   * Displays a widget that lets users input a date, time, or date and time.
   *
   * For example, the following JSON creates a date time picker to schedule an
   * appointment:
   *
   *
   * ```
   * "dateTimePicker": {
   *   "name": "appointment_time",
   *   "label": "Book your appointment at:",
   *   "type": "DATE_AND_TIME",
   *   "valueMsEpoch": "796435200000"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.DateTimePicker date_time_picker = 7;</code>
   *
   * @return The dateTimePicker.
   */
  com.google.apps.card.v1.DateTimePicker getDateTimePicker();
  /**
   *
   *
   * <pre>
   * Displays a widget that lets users input a date, time, or date and time.
   *
   * For example, the following JSON creates a date time picker to schedule an
   * appointment:
   *
   *
   * ```
   * "dateTimePicker": {
   *   "name": "appointment_time",
   *   "label": "Book your appointment at:",
   *   "type": "DATE_AND_TIME",
   *   "valueMsEpoch": "796435200000"
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.DateTimePicker date_time_picker = 7;</code>
   */
  com.google.apps.card.v1.DateTimePickerOrBuilder getDateTimePickerOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays a horizontal line divider between widgets.
   *
   * For example, the following JSON creates a divider:
   * ```
   * "divider": {
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Divider divider = 9;</code>
   *
   * @return Whether the divider field is set.
   */
  boolean hasDivider();
  /**
   *
   *
   * <pre>
   * Displays a horizontal line divider between widgets.
   *
   * For example, the following JSON creates a divider:
   * ```
   * "divider": {
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Divider divider = 9;</code>
   *
   * @return The divider.
   */
  com.google.apps.card.v1.Divider getDivider();
  /**
   *
   *
   * <pre>
   * Displays a horizontal line divider between widgets.
   *
   * For example, the following JSON creates a divider:
   * ```
   * "divider": {
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Divider divider = 9;</code>
   */
  com.google.apps.card.v1.DividerOrBuilder getDividerOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays a grid with a collection of items.
   *
   * A grid supports any number of columns and items. The number of rows is
   * determined by the upper bounds of the number items divided by the number
   * of columns. A grid with 10 items and 2 columns has 5 rows. A grid with 11
   * items and 2 columns has 6 rows.
   *
   * [Google Workspace Add-ons and
   * Chat apps](https://developers.google.com/workspace/extend):
   *
   * For example, the following JSON creates a 2 column grid with a single
   * item:
   *
   * ```
   * "grid": {
   *   "title": "A fine collection of items",
   *   "columnCount": 2,
   *   "borderStyle": {
   *     "type": "STROKE",
   *     "cornerRadius": 4
   *   },
   *   "items": [
   *     {
   *       "image": {
   *         "imageUri": "https://www.example.com/image.png",
   *         "cropStyle": {
   *           "type": "SQUARE"
   *         },
   *         "borderStyle": {
   *           "type": "STROKE"
   *         }
   *       },
   *       "title": "An item",
   *       "textAlignment": "CENTER"
   *     }
   *   ],
   *   "onClick": {
   *     "openLink": {
   *       "url": "https://www.example.com"
   *     }
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Grid grid = 10;</code>
   *
   * @return Whether the grid field is set.
   */
  boolean hasGrid();
  /**
   *
   *
   * <pre>
   * Displays a grid with a collection of items.
   *
   * A grid supports any number of columns and items. The number of rows is
   * determined by the upper bounds of the number items divided by the number
   * of columns. A grid with 10 items and 2 columns has 5 rows. A grid with 11
   * items and 2 columns has 6 rows.
   *
   * [Google Workspace Add-ons and
   * Chat apps](https://developers.google.com/workspace/extend):
   *
   * For example, the following JSON creates a 2 column grid with a single
   * item:
   *
   * ```
   * "grid": {
   *   "title": "A fine collection of items",
   *   "columnCount": 2,
   *   "borderStyle": {
   *     "type": "STROKE",
   *     "cornerRadius": 4
   *   },
   *   "items": [
   *     {
   *       "image": {
   *         "imageUri": "https://www.example.com/image.png",
   *         "cropStyle": {
   *           "type": "SQUARE"
   *         },
   *         "borderStyle": {
   *           "type": "STROKE"
   *         }
   *       },
   *       "title": "An item",
   *       "textAlignment": "CENTER"
   *     }
   *   ],
   *   "onClick": {
   *     "openLink": {
   *       "url": "https://www.example.com"
   *     }
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Grid grid = 10;</code>
   *
   * @return The grid.
   */
  com.google.apps.card.v1.Grid getGrid();
  /**
   *
   *
   * <pre>
   * Displays a grid with a collection of items.
   *
   * A grid supports any number of columns and items. The number of rows is
   * determined by the upper bounds of the number items divided by the number
   * of columns. A grid with 10 items and 2 columns has 5 rows. A grid with 11
   * items and 2 columns has 6 rows.
   *
   * [Google Workspace Add-ons and
   * Chat apps](https://developers.google.com/workspace/extend):
   *
   * For example, the following JSON creates a 2 column grid with a single
   * item:
   *
   * ```
   * "grid": {
   *   "title": "A fine collection of items",
   *   "columnCount": 2,
   *   "borderStyle": {
   *     "type": "STROKE",
   *     "cornerRadius": 4
   *   },
   *   "items": [
   *     {
   *       "image": {
   *         "imageUri": "https://www.example.com/image.png",
   *         "cropStyle": {
   *           "type": "SQUARE"
   *         },
   *         "borderStyle": {
   *           "type": "STROKE"
   *         }
   *       },
   *       "title": "An item",
   *       "textAlignment": "CENTER"
   *     }
   *   ],
   *   "onClick": {
   *     "openLink": {
   *       "url": "https://www.example.com"
   *     }
   *   }
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Grid grid = 10;</code>
   */
  com.google.apps.card.v1.GridOrBuilder getGridOrBuilder();

  /**
   *
   *
   * <pre>
   * Displays up to 2 columns.
   *
   * To include more than 2 columns, or to use rows, use the `Grid` widget.
   *
   * For example, the following JSON creates 2 columns that each contain
   * text paragraphs:
   *
   * ```
   * "columns": {
   *   "columnItems": [
   *     {
   *       "horizontalSizeStyle": "FILL_AVAILABLE_SPACE",
   *       "horizontalAlignment": "CENTER",
   *       "verticalAlignment": "CENTER",
   *       "widgets": [
   *         {
   *           "textParagraph": {
   *             "text": "First column text paragraph"
   *           }
   *         }
   *       ]
   *     },
   *     {
   *       "horizontalSizeStyle": "FILL_AVAILABLE_SPACE",
   *       "horizontalAlignment": "CENTER",
   *       "verticalAlignment": "CENTER",
   *       "widgets": [
   *         {
   *           "textParagraph": {
   *             "text": "Second column text paragraph"
   *           }
   *         }
   *       ]
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Columns columns = 11;</code>
   *
   * @return Whether the columns field is set.
   */
  boolean hasColumns();
  /**
   *
   *
   * <pre>
   * Displays up to 2 columns.
   *
   * To include more than 2 columns, or to use rows, use the `Grid` widget.
   *
   * For example, the following JSON creates 2 columns that each contain
   * text paragraphs:
   *
   * ```
   * "columns": {
   *   "columnItems": [
   *     {
   *       "horizontalSizeStyle": "FILL_AVAILABLE_SPACE",
   *       "horizontalAlignment": "CENTER",
   *       "verticalAlignment": "CENTER",
   *       "widgets": [
   *         {
   *           "textParagraph": {
   *             "text": "First column text paragraph"
   *           }
   *         }
   *       ]
   *     },
   *     {
   *       "horizontalSizeStyle": "FILL_AVAILABLE_SPACE",
   *       "horizontalAlignment": "CENTER",
   *       "verticalAlignment": "CENTER",
   *       "widgets": [
   *         {
   *           "textParagraph": {
   *             "text": "Second column text paragraph"
   *           }
   *         }
   *       ]
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Columns columns = 11;</code>
   *
   * @return The columns.
   */
  com.google.apps.card.v1.Columns getColumns();
  /**
   *
   *
   * <pre>
   * Displays up to 2 columns.
   *
   * To include more than 2 columns, or to use rows, use the `Grid` widget.
   *
   * For example, the following JSON creates 2 columns that each contain
   * text paragraphs:
   *
   * ```
   * "columns": {
   *   "columnItems": [
   *     {
   *       "horizontalSizeStyle": "FILL_AVAILABLE_SPACE",
   *       "horizontalAlignment": "CENTER",
   *       "verticalAlignment": "CENTER",
   *       "widgets": [
   *         {
   *           "textParagraph": {
   *             "text": "First column text paragraph"
   *           }
   *         }
   *       ]
   *     },
   *     {
   *       "horizontalSizeStyle": "FILL_AVAILABLE_SPACE",
   *       "horizontalAlignment": "CENTER",
   *       "verticalAlignment": "CENTER",
   *       "widgets": [
   *         {
   *           "textParagraph": {
   *             "text": "Second column text paragraph"
   *           }
   *         }
   *       ]
   *     }
   *   ]
   * }
   * ```
   * </pre>
   *
   * <code>.google.apps.card.v1.Columns columns = 11;</code>
   */
  com.google.apps.card.v1.ColumnsOrBuilder getColumnsOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies whether widgets align to the left, right, or center of a column.
   * </pre>
   *
   * <code>.google.apps.card.v1.Widget.HorizontalAlignment horizontal_alignment = 8;</code>
   *
   * @return The enum numeric value on the wire for horizontalAlignment.
   */
  int getHorizontalAlignmentValue();
  /**
   *
   *
   * <pre>
   * Specifies whether widgets align to the left, right, or center of a column.
   * </pre>
   *
   * <code>.google.apps.card.v1.Widget.HorizontalAlignment horizontal_alignment = 8;</code>
   *
   * @return The horizontalAlignment.
   */
  com.google.apps.card.v1.Widget.HorizontalAlignment getHorizontalAlignment();

  com.google.apps.card.v1.Widget.DataCase getDataCase();
}
