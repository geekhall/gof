## Principle 6 : 迪米特法则（Least Knowledge Principle， LKP）
内容：又叫做最少知识原则。只与你的直接朋友交谈，不跟“陌生人”说话。

含义：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。

例子：
分析：明星由于全身心投入艺术，所以许多日常事务由经纪人负责处理，如与粉丝的见面会，
与媒体公司的业务洽淡等。这里的经纪人是明星的朋友，而粉丝和媒体公司是陌生人，所以适合使用迪米特法则
