/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @flow strict
 * @format
 */

import * as React from 'react';

type ContextType = ?string;

const Context: React.Context<ContextType> =
  React.createContext<ContextType>(null);

if (__DEV__) {
  Context.displayName = 'ImageAnalyticsTagContext';
}

export default Context;
