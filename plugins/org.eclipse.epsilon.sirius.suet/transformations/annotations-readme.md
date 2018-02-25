Sirius
======
! = not yet supported
* = partial support
+ = new from sirius

gmf.diagram
-----------
model.extension
    Extension of model files that can be used. Defaults to wildcard * (any file)
    
!diagram.extension
!onefile
!rcp
!units

gmf.node
--------
color
    rgb comma-separated value specifying color of the node background
figure
    The shape of the node can be one of: square, diamond, ellipse. Defaults to ellipse
resizeable
    Boolean value to set if the node can be resized by user. Defaults to true

label
    Name of feature to use as the label for this node. This or label.eol must be defined
label.eol
    EOL expression to use to define label of this node. This or label must be define
label.color
    rgb comma-separated value specifying color of the label text color
label.placement 
    Placement of the label. Defaults to internal (in the node). Can be set to external or border

border.style
    Can be one of: dot, dash, dash_dot or solid. Defaults to solid
border.color
    rgb comma-separated value specifying color of the border color
border.width
    integer value specifying the width of the

!label.icon
!label.parser
!label.pattern
!label.view.pattern
!label.text
!label.readOnly
!margin
!phantom
!polygon.x
!polygon.y
!size
!svg.uri
!tool.description
!tool.large.bundle
!tool.large.path
!tool.name
!tool.small.bundle
!tool.small.path
!label.hidden

gmf.link (for EClass)
---------------------
color
source
source.decoration
style
target
target.decoration

width

!label
!label.parser
!label.text
!target.constraint
!incoming
!tool.description
!tool.large.bundle
!tool.large.path
!tool.name
!tool.small.bundle
!tool.small.path:

gmf.link (for non-containment EReference)
-----------------------------------------
color
source.decoration
style
target.decoration

!label
!label.text
!tool.description
!tool.large.bundle
!tool.large.path
!tool.name
!tool.small.bundle
!tool.small.path

gmf.compartment (for containment EReference)
--------------------------------------------
!collapsible
!layout

gmf.affixed
-----------

gmf.label
---------